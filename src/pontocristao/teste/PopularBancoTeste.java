/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.teste;

import java.util.Date;
import java.util.List;
import pontocristao.modelo.*;

/**
 *
 * @author marco
 */
public class PopularBancoTeste {

    public static void Popular() {
        CadastrarProdutos();
        CadastrarCaixa();
        CadastrarCliente();
        CadastrarClientePessoaFisica();
        CadastrarClientePessoaJuridica();
        CadastrarCodigoBarrasProprio();
    }

    private static void CadastrarProdutos() {
        Produto produto = new Produto();

        produto.setCodigoBarra("produto1");
        produto.setNome("Livro1");
        produto.setValorVenda(Double.valueOf("22"));
        produto.setQuantidade(Integer.parseInt("2"));
        //produto.setDataCadastro();

    }

    private static void CadastrarCaixa() {
        Caixa caixa = new Caixa();
        caixa.setSaldo(Double.valueOf("22"));
        //caixa.setMovimentacoes();
    }

    private static void CadastrarCliente() {
        Cliente cliente = new Cliente() {
        };

        cliente.setNome("teste");
        cliente.setTelefone("123123");
        cliente.setCelular("312321321");
        //cliente.setDataCadastro();
        cliente.setEmail("dsadasdasdsa@dasdas.com");
        cliente.setTotalLocacoes(Integer.parseInt("2"));
        //cliente.setDependentes(dependentes);
    }

    private static void CadastrarClientePessoaFisica() {
        ClientePessoaFisica clientePessoaFisica = new ClientePessoaFisica();
        clientePessoaFisica.setRg("21312312321");
        clientePessoaFisica.setCpf("21312321321");
    }
    
    private static void CadastrarClientePessoaJuridica() {
        ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica();
        clientePessoaJuridica.setCnpj("21321321");
    }
    
    private static void CadastrarCodigoBarrasProprio() {
        CodigoBarrasProprio codigoBarrasProprio = new CodigoBarrasProprio();
        codigoBarrasProprio.setPadrao("teste");
        codigoBarrasProprio.setUltimoCodigo(Integer.parseInt("2131"));
    }
    
    
    
    

}
