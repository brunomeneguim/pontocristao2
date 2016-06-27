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
        CadastrarCaixa();
        CadastrarCliente();
        CadastrarClientePessoaFisica();
        CadastrarClientePessoaJuridica();
        CadastrarCodigoBarrasProprio();
        CadastrarContaPagar();
        CadastrarDependente();
        CadastrarEndereco();
        CadastrarFilme();
        CadastrarFornecedor();
        CadastrarFuncionario();
        CadastrarItemLocacao();
        CadastrarItemVenda();
        CadastrarLocacao();
        CadastrarMovimentacaoCaixa();
        CadastrarMovimentacaoCaixaContaPagar();
        CadastrarMovimentacaoCaixaDeposito();
        CadastrarMovimentacaoCaixaEntrada();
        CadastrarMovimentacaoCaixaLocacao();
        CadastrarMovimentacaoCaixaRetirada();
        CadastrarMovimentacaoCaixaSaida();
        CadastrarMovimentacaoCaixaVenda();
        CadastrarPagamento();
        CadastrarProduto();
        CadastrarTabelaPrecoLocacao();
        CadastrarTipoContaPagar();
        CadastrarTipoFilme();
        CadastrarTipoPagamento();
        CadastrarTipoProduto();
        CadastrarVenda();

    }

    private static void CadastrarCaixa() {
        Caixa caixa = new Caixa();
        caixa.setSaldo(Double.valueOf("22"));
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

    private static void CadastrarContaPagar() {
        ContaPagar contaPagar = new ContaPagar();
        //contaPagar.setData(data);
        //contaPagar.setDataVencimento(dataVencimento);
        contaPagar.setValor(Double.valueOf("21312"));
    }

    private static void CadastrarDependente() {
        Dependente dependente = new Dependente();
        dependente.setNome("teste");
        dependente.setTelefone("213213");
        dependente.setRg("21312321");
        dependente.setCpf("21321312");
    }

    private static void CadastrarEndereco() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Teste");
        endereco.setNumero("123");
        endereco.setComplemento("Teste");
        endereco.setCep("21321");
        endereco.setBairro("Teste");
        endereco.setCidade("Teste");
        endereco.setEstado("Teste");
    }

    private static void CadastrarFilme() {
        Filme filme = new Filme();
        filme.setLancamento(Boolean.TRUE);
    }

    private static void CadastrarFornecedor() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNomeFantasia("teste");
        fornecedor.setTelefone("123");
        fornecedor.setCelular("123");
        fornecedor.setDescricao("teste");
        fornecedor.setCnpj("123");
        fornecedor.setRazaoSocial("teste");
        fornecedor.setInscricaoEstadual("123");
    }

    private static void CadastrarFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("teste");
        funcionario.setTelefoneResidencial("123");
        funcionario.setCelular("123");
        funcionario.setRg("123");
        funcionario.setCpf("123");
        funcionario.setSexo(Sexo.FEMININO);
        //funcionario.setDataNascimento(dataNascimento);
        //funcionario.setDataCadastro(dataCadastro);
        funcionario.setEmail("teste@teste.com");
        //funcionario.setDataAdmissao(dataAdmissao);
        funcionario.setCarteiraTrabalho("123");
        funcionario.setLogin("teste");
        funcionario.setSenha("teste");
    }

    private static void CadastrarItemLocacao() {
        ItemLocacao itemLocacao = new ItemLocacao();
        //itemLocacao.setDataPrevisaoEntrega(dataPrevisaoEntrega);
        //itemLocacao.setDataEntrega(dataEntrega);      
    }

    private static void CadastrarItemVenda() {
        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setQuantidade(Integer.MIN_VALUE);
        itemVenda.setValorUnitario(Double.valueOf("123"));
    }

    private static void CadastrarLocacao() {
        Locacao locacao = new Locacao();
        //locacao.setData(data);
        locacao.setValorTotal(Double.valueOf("12321"));
        locacao.setPago(Boolean.TRUE);
    }

    private static void CadastrarMovimentacaoCaixa() {
        MovimentacaoCaixa movimentacaoCaixa = new MovimentacaoCaixa() {
        };
        //movimentacaoCaixa.setData(data);
        movimentacaoCaixa.setValor(Double.valueOf("123"));
    }

    private static void CadastrarMovimentacaoCaixaContaPagar() {
        MovimentacaoCaixaContaPagar movimentacaoCaixaContaPagar = new MovimentacaoCaixaContaPagar();
    }

    private static void CadastrarMovimentacaoCaixaDeposito() {
        MovimentacaoCaixaDeposito movimentacaoCaixaDeposito = new MovimentacaoCaixaDeposito();
        movimentacaoCaixaDeposito.setDescricao("teste");
    }

    private static void CadastrarMovimentacaoCaixaEntrada() {
        MovimentacaoCaixaEntrada movimentacaoCaixaEntrada = new MovimentacaoCaixaEntrada() {
        };
        //movimentacaoCaixaEntrada.setDataFaturar(dataFaturar);
        movimentacaoCaixaEntrada.setFaturado(Boolean.TRUE);
    }

    private static void CadastrarMovimentacaoCaixaLocacao() {
        MovimentacaoCaixaLocacao movimentacaoCaixaLocacao = new MovimentacaoCaixaLocacao();
    }

    private static void CadastrarMovimentacaoCaixaRetirada() {
        MovimentacaoCaixaRetirada movimentacaoCaixaRetirada = new MovimentacaoCaixaRetirada();
        movimentacaoCaixaRetirada.setDescricao("teste");
    }

    private static void CadastrarMovimentacaoCaixaSaida() {
        MovimentacaoCaixaSaida movimentacaoCaixaSaida = new MovimentacaoCaixaSaida() {
        };

    }

    private static void CadastrarMovimentacaoCaixaVenda() {
        MovimentacaoCaixaVenda movimentacaoCaixaVenda = new MovimentacaoCaixaVenda();
    }

    private static void CadastrarPagamento() {
        Pagamento pagamento = new Pagamento();
        pagamento.setValor(Double.valueOf("123"));
        //pagamento.setData(data);
        pagamento.setDescricao("teste");
    }

    private static void CadastrarProduto() {
        Produto produto = new Produto();
        produto.setCodigoBarra("teste");
        produto.setNome("teste");
        produto.setValorVenda(Double.valueOf("123"));
        produto.setQuantidade(Integer.MIN_VALUE);
        //produto.setDataCadastro(dataCadastro);
    }

    private static void CadastrarTabelaPrecoLocacao() {
        TabelaPrecoLocacao tabelaPrecoLocacao = new TabelaPrecoLocacao();
        tabelaPrecoLocacao.setValorNormal(Double.valueOf("123"));
        tabelaPrecoLocacao.setValorLancamento(Double.valueOf("123"));
        tabelaPrecoLocacao.setValorMultaDiaria(Double.valueOf("123"));
    }

    private static void CadastrarTipoContaPagar() {
        TipoContaPagar tipoContaPagar = new TipoContaPagar();
        tipoContaPagar.setDescricao("teste");
    }

    private static void CadastrarTipoFilme() {
        TipoFilme tipoFilme = new TipoFilme();
        tipoFilme.setDescricao("teste");
    }

    private static void CadastrarTipoPagamento() {
        TipoPagamento tipoPagamento = new TipoPagamento();
        tipoPagamento.setDescricao("teste");
    }

    private static void CadastrarTipoProduto() {
        TipoProduto tipoProduto = new TipoProduto();
        tipoProduto.setDescricao("teste");
    }

    private static void CadastrarVenda() {
        Venda venda = new Venda();
        //venda.setData(data);
        venda.setValorTotal(Double.valueOf("123"));
        venda.setPago(Boolean.TRUE);
    }

}
