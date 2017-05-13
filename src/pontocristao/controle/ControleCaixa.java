/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.controle;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pontocristao.modelo.Caixa;
import pontocristao.modelo.MovimentacaoCaixa;
import pontocristao.modelo.MovimentacaoCaixaContaPagar;
import pontocristao.modelo.MovimentacaoCaixaDeposito;
import pontocristao.modelo.MovimentacaoCaixaEntrada;
import pontocristao.modelo.MovimentacaoCaixaSaida;
import pontocristao.util.HibernateUtil;

/**
 *
 * @author Marco
 */
public class ControleCaixa extends ControleBase {

//    public Caixa getCaixa() {
//        return (Caixa) this.getModelo();
//    }
//
//    public void setCaixa(Caixa caixa) {
//        this.setModelo(caixa);
//    }
    public ControleCaixa(Session sessao) {
        if (sessao != null) {
            setSessao(sessao);
        }

        //setModelo(RetornarCaixa());
    }

    public Caixa RetornarCaixa() {
        String sql = "SELECT * FROM Caixa WHERE excluido = false";
        Query q = getSessao().createSQLQuery(sql).addEntity(Caixa.class);

        List<Caixa> caixas = (List<Caixa>) q.list();

        if (caixas.isEmpty()) {

            Caixa caixa = new Caixa();
            caixa.setSaldo(0d);
           
            getSessao().save(caixa);
            
            return RetornarCaixa();
        } else {
            return caixas.get(caixas.size() - 1);
        }
    }

    public void AdicionarMovimentacao(MovimentacaoCaixa movimentacao) throws Exception {
        Caixa caixa = RetornarCaixa();
        movimentacao.setCaixa(caixa);
        caixa.getMovimentacoes().add(movimentacao);

        if(movimentacao instanceof MovimentacaoCaixaEntrada)
        {
            caixa.setSaldo(caixa.getSaldo() + movimentacao.getValor());
            
            MovimentacaoCaixaEntrada mov = (MovimentacaoCaixaEntrada)movimentacao;
            mov.setFaturado(true);
            mov.setDataFaturar(new Date());
        }
        else if(movimentacao instanceof MovimentacaoCaixaSaida)
        {
            caixa.setSaldo(caixa.getSaldo() - movimentacao.getValor());
        }
        else
        {
            throw new Exception("Tipo desconhecido.");
        }
        
        Session s = getSessao();

        s.saveOrUpdate(movimentacao);
        s.saveOrUpdate(caixa);

    }

}
