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
import pontocristao.modelo.*;

/**
 *
 * @author Marco
 */
public class ControleLocacao extends ControleBase {
    
    public Locacao getLocacao() {
        return (Locacao) this.getModelo();
    }

    public void setLocacao(Locacao locacao) {
        this.setModelo(locacao);
    }

    public ControleLocacao() {
        setModelo(new Locacao());
    }

    public List<Locacao> RetornarLocacoes() {
        String sql = "SELECT * FROM Locacao WHERE excluido = false";
        Query q = this.getSessao().createSQLQuery(sql).addEntity(Locacao.class);
        return (List<Locacao>) q.list();
    }

    public List<Locacao> RetornarLocacoes(String[] camposPesquisa, String textoPesquisa) {
        String sql = "SELECT * FROM Locacao JOIN Cliente ON Cliente.id = Locacao.cliente_id ";

        if (camposPesquisa != null && textoPesquisa != null && camposPesquisa.length > 0 && textoPesquisa.length() > 0) {
            sql += " WHERE (";

            for (int i = 0; i < camposPesquisa.length; i++) {
                sql += camposPesquisa[i] + " LIKE '%" + textoPesquisa + "%'";
                if (i + 1 < camposPesquisa.length) {
                    sql += " OR ";
                } else {
                    sql += ") AND Locacao.excluido = false";
                }
            }
        } else {
            sql += " WHERE Locacao.excluido = false";
        }

        Query q = this.getSessao().createSQLQuery(sql).addEntity(Locacao.class);
        return (List<Locacao>) q.list();
    }
    
    public  List<Cliente> RetornarClientes() {
        ControleCliente controleCliente = new ControleCliente(false);
        return controleCliente.RetornarClientes();
    }

    public Exception RecuperarLocacao(long id) {
        String sql = "SELECT * FROM Locacao WHERE Locacao.Id = " + id;
        Exception erro = null;

        try {
            Query q = this.getSessao().createSQLQuery(sql).addEntity(Locacao.class);
            List resultados = q.list();

            if (resultados.size() == 1) {
                this.setLocacao((Locacao) resultados.get(0));
            } else {
                throw new Exception("Não foi possível encontrar a locação com o id " + id);
            }
        } catch (Exception e) {
            erro = e;
        } finally {
            return erro;
        }
    }

    public Exception Excluir(long id) {
        String sql = "SELECT * FROM Locacao WHERE id = " + id;
        Exception erro = null;

        try {
            Session s = getSessao();
            Query q = s.createSQLQuery(sql).addEntity(Locacao.class);
            List resultados = q.list();

            if (resultados.size() == 1) {
                Locacao locacao = (Locacao) resultados.get(0);
                locacao.setExcluido(true);

                Transaction transacao = s.getTransaction();

                transacao.begin();
                s.save(locacao);
                transacao.commit();

            } else {
                throw new Exception("Não foi possível encontrar a locação com o id " + id);
            }
        } catch (Exception e) {
            erro = e;
        } finally {
            return erro;
        }
    }

    public Exception Salvar() {
        if (getLocacao().getId() <= 0) {
            getLocacao().setData(new Date());
        }
        return Salvar(getModelo());
    }
}
