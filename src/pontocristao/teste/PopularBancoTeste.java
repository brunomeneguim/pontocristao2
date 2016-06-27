/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.teste;

import java.util.ArrayList;
import java.util.Date;
import pontocristao.modelo.*;

/**
 *
 * @author marco
 */
public class PopularBancoTeste {

    public static void Popular() {
        CadastrarCaixa();
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
        CadastrarMovimentacaoCaixaContaPagar();
        CadastrarMovimentacaoCaixaDeposito();
        CadastrarMovimentacaoCaixaLocacao();
        CadastrarMovimentacaoCaixaRetirada();
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
        caixa.setMovimentacoes(new ArrayList<MovimentacaoCaixa>());
    }

    private static void CadastrarClientePessoaFisica() {
        ClientePessoaFisica clientePessoaFisica = new ClientePessoaFisica();
        clientePessoaFisica.setRg("21312312321");
        clientePessoaFisica.setCpf("21312321321");
        clientePessoaFisica.setNome("teste");
        clientePessoaFisica.setTelefone("123123");
        clientePessoaFisica.setCelular("312321321");
        clientePessoaFisica.setDataCadastro(new Date(1922, 20, 14));
        clientePessoaFisica.setEmail("dsadasdasdsa@dasdas.com");
        clientePessoaFisica.setTotalLocacoes(Integer.parseInt("2"));
        clientePessoaFisica.setDependentes(new ArrayList<Dependente>(3));
        clientePessoaFisica.setEndereco(new Endereco());
    }

    private static void CadastrarClientePessoaJuridica() {
        ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica();
        clientePessoaJuridica.setCnpj("21321321");
        clientePessoaJuridica.setNome("teste");
        clientePessoaJuridica.setTelefone("123123");
        clientePessoaJuridica.setCelular("312321321");
        clientePessoaJuridica.setDataCadastro(new Date(2016, 6, 27));
        clientePessoaJuridica.setEmail("dsadasdasdsa@dasdas.com");
        clientePessoaJuridica.setTotalLocacoes(Integer.parseInt("2"));
        clientePessoaJuridica.setDependentes(new ArrayList<Dependente>(3));
        clientePessoaJuridica.setEndereco(new Endereco());
    }

    private static void CadastrarCodigoBarrasProprio() {
        CodigoBarrasProprio codigoBarrasProprio = new CodigoBarrasProprio();
        codigoBarrasProprio.setPadrao("teste");
        codigoBarrasProprio.setUltimoCodigo(Integer.parseInt("2131"));
    }

    private static void CadastrarContaPagar() {
        ContaPagar contaPagar = new ContaPagar();
        contaPagar.setData(new Date(2011, 12, 10));
        contaPagar.setDataVencimento(new Date(2011, 12, 10));
        contaPagar.setValor(Double.valueOf("21312"));
        contaPagar.setTipoContaPagar(new TipoContaPagar());
    }

    private static void CadastrarDependente() {
        Dependente dependente = new Dependente();
        dependente.setNome("teste");
        dependente.setTelefone("213213");
        dependente.setRg("21312321");
        dependente.setCpf("21321312");
        dependente.setCliente(new ClientePessoaFisica());
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
        fornecedor.setProdutos(new ArrayList<Produto>(3));
    }

    private static void CadastrarFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("teste");
        funcionario.setTelefoneResidencial("123");
        funcionario.setCelular("123");
        funcionario.setRg("123");
        funcionario.setCpf("123");
        funcionario.setSexo(Sexo.FEMININO);
        funcionario.setDataNascimento(new Date(1992, 12, 10));
        funcionario.setDataCadastro(new Date(2011, 12, 10));
        funcionario.setEmail("teste@teste.com");
        funcionario.setDataAdmissao(new Date(2011, 12, 10));
        funcionario.setCarteiraTrabalho("123");
        funcionario.setLogin("teste");
        funcionario.setSenha("teste");
        funcionario.setEndereco(new Endereco());
    }

    private static void CadastrarItemLocacao() {
        ItemLocacao itemLocacao = new ItemLocacao();
        itemLocacao.setDataEntrega(new Date(2016, 12, 10));
        itemLocacao.setDataPrevisaoEntrega(new Date(2011, 11, 21));
        itemLocacao.setLocacao(new Locacao());
        itemLocacao.setFilme(new Filme());
    }

    private static void CadastrarItemVenda() {
        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setQuantidade(Integer.MIN_VALUE);
        itemVenda.setValorUnitario(Double.valueOf("123"));
        itemVenda.setProduto(new Produto());
    }

    private static void CadastrarLocacao() {
        Locacao locacao = new Locacao();
        locacao.setData(new Date(2011, 12, 10));
        locacao.setValorTotal(Double.valueOf("12321"));
        locacao.setPago(Boolean.TRUE);
        locacao.setItensLocacao(new ArrayList<ItemLocacao>(1));
        locacao.setCliente(new ClientePessoaFisica());
        locacao.setFuncionario(new Funcionario());
        locacao.setPagamentos(new ArrayList<Pagamento>(1));
    }

    private static void CadastrarMovimentacaoCaixaContaPagar() {
        MovimentacaoCaixaContaPagar movimentacaoCaixaContaPagar = new MovimentacaoCaixaContaPagar();
        movimentacaoCaixaContaPagar.setContaPagar(new ContaPagar());
        movimentacaoCaixaContaPagar.setData(new Date(2011, 12, 10));
        movimentacaoCaixaContaPagar.setFuncionario(new Funcionario());
        movimentacaoCaixaContaPagar.setValor(Double.valueOf("123"));

    }

    private static void CadastrarMovimentacaoCaixaDeposito() {
        MovimentacaoCaixaDeposito movimentacaoCaixaDeposito = new MovimentacaoCaixaDeposito();
        movimentacaoCaixaDeposito.setDescricao("teste");
        movimentacaoCaixaDeposito.setData(new Date(2011, 12, 10));
        movimentacaoCaixaDeposito.setDataFaturar(new Date(2011, 12, 10));
        movimentacaoCaixaDeposito.setFaturado(Boolean.TRUE);
        movimentacaoCaixaDeposito.setFuncionario(new Funcionario());
        movimentacaoCaixaDeposito.setValor(Double.valueOf("123"));
    }

    private static void CadastrarMovimentacaoCaixaLocacao() {
        MovimentacaoCaixaLocacao movimentacaoCaixaLocacao = new MovimentacaoCaixaLocacao();
        movimentacaoCaixaLocacao.setDataFaturar(new Date(2011, 12, 10));
        movimentacaoCaixaLocacao.setFaturado(Boolean.TRUE);
        movimentacaoCaixaLocacao.setData(new Date(2011, 12, 10));
        movimentacaoCaixaLocacao.setValor(Double.valueOf("123"));
        movimentacaoCaixaLocacao.setFuncionario(new Funcionario());
        movimentacaoCaixaLocacao.setData(new Date(2011, 12, 10));
    }

    private static void CadastrarMovimentacaoCaixaRetirada() {
        MovimentacaoCaixaRetirada movimentacaoCaixaRetirada = new MovimentacaoCaixaRetirada();
        movimentacaoCaixaRetirada.setDescricao("teste");
        movimentacaoCaixaRetirada.setData(new Date(2011, 12, 10));
        movimentacaoCaixaRetirada.setFuncionario(new Funcionario());
        movimentacaoCaixaRetirada.setValor(Double.valueOf("231"));
    }

    private static void CadastrarMovimentacaoCaixaVenda() {
        MovimentacaoCaixaVenda movimentacaoCaixaVenda = new MovimentacaoCaixaVenda();
        movimentacaoCaixaVenda.setData(new Date(2011, 12, 10));
        movimentacaoCaixaVenda.setDataFaturar(new Date(2011, 12, 10));
        movimentacaoCaixaVenda.setFaturado(Boolean.TRUE);
        movimentacaoCaixaVenda.setFuncionario(new Funcionario());
        movimentacaoCaixaVenda.setValor(Double.valueOf("123"));
        movimentacaoCaixaVenda.setVenda(new Venda());
    }

    private static void CadastrarPagamento() {
        Pagamento pagamento = new Pagamento();
        pagamento.setValor(Double.valueOf("123"));
        pagamento.setData(new Date(2011, 12, 10));
        pagamento.setDescricao("teste");
        pagamento.setTipoPagamento(new TipoPagamento());
    }

    private static void CadastrarProduto() {
        Produto produto = new Produto();
        produto.setCodigoBarra("teste");
        produto.setNome("teste");
        produto.setValorVenda(Double.valueOf("123"));
        produto.setQuantidade(Integer.MIN_VALUE);
        produto.setDataCadastro(new Date(2011, 12, 10));
        produto.setFornecedor(new Fornecedor());
        produto.setTipoProduto(new TipoProduto());
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
        venda.setData(new Date(2011, 12, 10));
        venda.setValorTotal(Double.valueOf("123"));
        venda.setPago(Boolean.TRUE);
        venda.setCliente(new ClientePessoaFisica());
        venda.setFuncionario(new Funcionario());
        venda.setItensVenda(new ArrayList<ItemVenda>());
        venda.setPagamentos(new ArrayList<Pagamento>());
    }

}
