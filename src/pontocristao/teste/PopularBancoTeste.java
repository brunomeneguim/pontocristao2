/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import pontocristao.modelo.*;

/**
 *
 * @author marco
 */
public class PopularBancoTeste {

    List<Funcionario> funcionario = (List<Funcionario>) null;

    public static Calendar Data_Calendar() {
        Calendar calendar = Calendar.getInstance();
        return calendar;
    }

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

    //-----------------------------------CLIENTE PESSOA FISICA-----------------------------------//
    private static void CadastrarClientePessoaFisica() {
        ClientePessoaFisica clientePessoaFisica = RetornarClientePessoaFisica();
    }

    private static ClientePessoaFisica RetornarClientePessoaFisica() {
        ClientePessoaFisica clientePessoaFisica = new ClientePessoaFisica();
        clientePessoaFisica.setRg("21312312321");
        clientePessoaFisica.setCpf("21312321321");
        clientePessoaFisica.setNome("teste");
        clientePessoaFisica.setTelefone("123123");
        clientePessoaFisica.setCelular("312321321");
        clientePessoaFisica.setEmail("dsadasdasdsa@dasdas.com");
        clientePessoaFisica.setDataCadastro(Data_Calendar().getTime());
        clientePessoaFisica.setDataCadastro(Data_Calendar().getTime());
        clientePessoaFisica.setTotalLocacoes(Integer.parseInt("2"));

        clientePessoaFisica.setEndereco(RetornarEndereco());
        clientePessoaFisica.setDependentes(new ArrayList<Dependente>(3));

        return clientePessoaFisica;
    }
//-----------------------------------CLIENTE PESSOA JURIDICA-----------------------------------//

    private static void CadastrarClientePessoaJuridica() {
        ClientePessoaJuridica clientePessoaJuridica = RetornarClientePessoaJuridica();
    }

    private static ClientePessoaJuridica RetornarClientePessoaJuridica() {
        ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica();
        clientePessoaJuridica.setCnpj("21321321");
        clientePessoaJuridica.setNome("teste");
        clientePessoaJuridica.setTelefone("123123");
        clientePessoaJuridica.setCelular("312321321");
        clientePessoaJuridica.setEmail("dsadasdasdsa@dasdas.com");
        clientePessoaJuridica.setTotalLocacoes(Integer.parseInt("2"));
        clientePessoaJuridica.setDataCadastro(Data_Calendar().getTime());

        clientePessoaJuridica.setEndereco(RetornarEndereco());
        clientePessoaJuridica.setDependentes(new ArrayList<Dependente>(3));

        return clientePessoaJuridica;
    }

    //-----------------------------------------------------------------------------------------//
    private static void CadastrarCodigoBarrasProprio() {
        CodigoBarrasProprio codigoBarrasProprio = new CodigoBarrasProprio();
        codigoBarrasProprio.setPadrao("teste");
        codigoBarrasProprio.setUltimoCodigo(Integer.parseInt("2131"));
    }

    //------------------------------------ CONTA PAGAR ------------------------------------------------//
    private static void CadastrarContaPagar() {
        ContaPagar contaPagar = RetornarContaPagar();
    }

    private static ContaPagar RetornarContaPagar() {
        ContaPagar contaPagar = new ContaPagar();
        contaPagar.setValor(Double.valueOf("21312"));
        contaPagar.setData(Data_Calendar().getTime());
        contaPagar.setDataVencimento(Data_Calendar().getTime());

        contaPagar.setTipoContaPagar(RetornarTipoContaPagar());

        return contaPagar;
    }
//--------------------------------------- DEPENDENTE ---------------------------------------//

    private static void CadastrarDependente() {
        Dependente dependente = RetornarDependente();
    }

    private static Dependente RetornarDependente() {
        Dependente dependente = new Dependente();
        dependente.setNome("teste");
        dependente.setTelefone("213213");
        dependente.setRg("21312321");
        dependente.setCpf("21321312");

        dependente.setCliente(RetornarClientePessoaFisica());
        return dependente;
    }
//--------------------------------------- ENDERECO ---------------------------------------//

    private static void CadastrarEndereco() {
        Endereco endereco = RetornarEndereco();

        //tem que salvar o endereço
    }

    private static Endereco RetornarEndereco() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Teste");
        endereco.setNumero("123");
        endereco.setComplemento("Teste");
        endereco.setCep("21321");
        endereco.setBairro("Teste");
        endereco.setCidade("Teste");
        endereco.setEstado("Teste");

        return endereco;
    }
//---------------------------------- FILME -----------------------------------------------------------//

    private static void CadastrarFilme() {
        Filme filme = RetornarFilme();
    }

    private static Filme RetornarFilme() {
        Filme filme = new Filme();
        filme.setLancamento(Boolean.TRUE);

        return filme;
    }
//---------------------------- FORNECEDOR -------------------------------------------------------------//

    private static void CadastrarFornecedor() {
        Fornecedor fornecedor = RetornarFornecedor();
    }

    private static Fornecedor RetornarFornecedor() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNomeFantasia("teste");
        fornecedor.setTelefone("123");
        fornecedor.setCelular("123");
        fornecedor.setDescricao("teste");
        fornecedor.setCnpj("123");
        fornecedor.setRazaoSocial("teste");
        fornecedor.setInscricaoEstadual("123");

        fornecedor.setProdutos(new ArrayList<Produto>(3));

        return fornecedor;
    }
//------------------------------ FUNCIONARIO -----------------------------------------------------------//

    private static void CadastrarFuncionario() {
        Funcionario funcionario = RetornarFuncionario();
    }

    private static void FuncionarioList(ArrayList Funcionario) {
        Funcionario funcionario = RetornarFuncionario();
    }

    private static Funcionario RetornarFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("teste");
        funcionario.setTelefoneResidencial("123");
        funcionario.setCelular("123");
        funcionario.setRg("123");
        funcionario.setCpf("123");
        funcionario.setSexo(Sexo.FEMININO);
        funcionario.setDataNascimento(Data_Calendar().getTime());
        funcionario.setDataCadastro(Data_Calendar().getTime());
        funcionario.setEmail("teste@teste.com");
        funcionario.setDataAdmissao(Data_Calendar().getTime());
        funcionario.setCarteiraTrabalho("123");
        funcionario.setLogin("teste");
        funcionario.setSenha("teste");

        funcionario.setEndereco(RetornarEndereco());

        return funcionario;
    }
//-----------------------------------------------------------------------------------------//

    private static void CadastrarItemLocacao() {
        ItemLocacao itemLocacao = new ItemLocacao();
        itemLocacao.setDataEntrega(Data_Calendar().getTime());
        itemLocacao.setDataPrevisaoEntrega(Data_Calendar().getTime());

        itemLocacao.setLocacao(RetornarLocacao());
        itemLocacao.setFilme(RetornarFilme());
    }

    private static void CadastrarItemVenda() {
        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setQuantidade(Integer.SIZE);
        itemVenda.setValorUnitario(Double.valueOf("123"));

        itemVenda.setProduto(RetornarProduto());
    }
//-----------------------------------LOCACAO------------------------------------------------------//

    private static void CadastrarLocacao() {
        Locacao locacao = RetornarLocacao();
    }

    private static Locacao RetornarLocacao() {
        Locacao locacao = new Locacao();
        locacao.setData(Data_Calendar().getTime());
        locacao.setValorTotal(Double.valueOf("12321"));
        locacao.setPago(Boolean.TRUE);

        locacao.setCliente(RetornarClientePessoaFisica());
        locacao.setFuncionario(RetornarFuncionario());
        locacao.setItemLocacao(new ArrayList<ItemLocacao>(1));
        locacao.setPagamentos(new ArrayList<Pagamento>(1));

        return locacao;
    }
//-----------------------------------------------------------------------------------------//

    private static void CadastrarMovimentacaoCaixaContaPagar() {
        MovimentacaoCaixaContaPagar movimentacaoCaixaContaPagar = new MovimentacaoCaixaContaPagar();
        movimentacaoCaixaContaPagar.setData(Data_Calendar().getTime());
        movimentacaoCaixaContaPagar.setValor(Double.valueOf("123"));

        movimentacaoCaixaContaPagar.setFuncionario(RetornarFuncionario());
        movimentacaoCaixaContaPagar.setContaPagar(RetornarContaPagar());
    }

    private static void CadastrarMovimentacaoCaixaDeposito() {
        MovimentacaoCaixaDeposito movimentacaoCaixaDeposito = new MovimentacaoCaixaDeposito();
        movimentacaoCaixaDeposito.setDescricao("teste");
        movimentacaoCaixaDeposito.setData(Data_Calendar().getTime());
        movimentacaoCaixaDeposito.setDataFaturar(Data_Calendar().getTime());
        movimentacaoCaixaDeposito.setFaturado(Boolean.TRUE);
        movimentacaoCaixaDeposito.setValor(Double.valueOf("123"));

        movimentacaoCaixaDeposito.setFuncionario(RetornarFuncionario());
    }

    private static void CadastrarMovimentacaoCaixaLocacao() {
        MovimentacaoCaixaLocacao movimentacaoCaixaLocacao = new MovimentacaoCaixaLocacao();
        movimentacaoCaixaLocacao.setDataFaturar(Data_Calendar().getTime());
        movimentacaoCaixaLocacao.setFaturado(Boolean.TRUE);
        movimentacaoCaixaLocacao.setData(Data_Calendar().getTime());
        movimentacaoCaixaLocacao.setValor(Double.valueOf("123"));
        movimentacaoCaixaLocacao.setData(Data_Calendar().getTime());

        movimentacaoCaixaLocacao.setFuncionario(RetornarFuncionario());
    }

    private static void CadastrarMovimentacaoCaixaRetirada() {
        MovimentacaoCaixaRetirada movimentacaoCaixaRetirada = new MovimentacaoCaixaRetirada();
        movimentacaoCaixaRetirada.setDescricao("teste");
        movimentacaoCaixaRetirada.setData(Data_Calendar().getTime());
        movimentacaoCaixaRetirada.setValor(Double.valueOf("231"));

        movimentacaoCaixaRetirada.setFuncionario(RetornarFuncionario());
    }

    private static void CadastrarMovimentacaoCaixaVenda() {
        MovimentacaoCaixaVenda movimentacaoCaixaVenda = new MovimentacaoCaixaVenda();
        movimentacaoCaixaVenda.setData(Data_Calendar().getTime());
        movimentacaoCaixaVenda.setDataFaturar(Data_Calendar().getTime());
        movimentacaoCaixaVenda.setFaturado(Boolean.TRUE);
        movimentacaoCaixaVenda.setValor(Double.valueOf("123"));

        movimentacaoCaixaVenda.setVenda(RetornarVenda());
        movimentacaoCaixaVenda.setFuncionario(RetornarFuncionario());
    }

    private static void CadastrarPagamento() {
        Pagamento pagamento = new Pagamento();
        pagamento.setValor(Double.valueOf("123"));
        pagamento.setData(Data_Calendar().getTime());
        pagamento.setDescricao("teste");

        pagamento.setTipoPagamento(RetornarTipoPagamento());
    }
//------------------------------ PRODUTO -----------------------------------------------------------//

    private static void CadastrarProduto() {
        Produto produto = RetornarProduto();
    }

    private static Produto RetornarProduto() {
        Produto produto = new Produto();
        produto.setCodigoBarra("teste");
        produto.setNome("teste");
        produto.setValorVenda(Double.valueOf("123"));
        produto.setQuantidade(Integer.MIN_VALUE);
        produto.setDataCadastro(Data_Calendar().getTime());

        produto.setFornecedor(RetornarFornecedor());
        produto.setTipoProduto(RetornarTipoProduto());

        return produto;

    }
//---------------------------------------------------------------------------------------//

    private static void CadastrarTabelaPrecoLocacao() {
        TabelaPrecoLocacao tabelaPrecoLocacao = new TabelaPrecoLocacao();
        tabelaPrecoLocacao.setValorNormal(Double.valueOf("123"));
        tabelaPrecoLocacao.setValorLancamento(Double.valueOf("123"));
        tabelaPrecoLocacao.setValorMultaDiaria(Double.valueOf("123"));
    }
//----------------------------- TIPO CONTA PAGAR -------------------------------------------//

    private static void CadastrarTipoContaPagar() {
        TipoContaPagar tipoContaPagar = RetornarTipoContaPagar();
    }

    private static TipoContaPagar RetornarTipoContaPagar() {
        TipoContaPagar tipoContaPagar = new TipoContaPagar();
        tipoContaPagar.setDescricao("teste");

        return tipoContaPagar;
    }
//---------------------------------- TIPO FILME--------------------------------------------//

    private static void CadastrarTipoFilme() {
        TipoFilme tipoFilme = RetornarTipoFilme();
    }

    private static TipoFilme RetornarTipoFilme() {
        TipoFilme tipoFilme = new TipoFilme();
        tipoFilme.setDescricao("teste");

        return tipoFilme;
    }

//------------------------------ TIPO PAGAMENTO -------------------------------------------//
    private static void CadastrarTipoPagamento() {
        TipoPagamento tipoPagamento = RetornarTipoPagamento();
    }

    private static TipoPagamento RetornarTipoPagamento() {
        TipoPagamento tipoPagamento = new TipoPagamento();
        tipoPagamento.setDescricao("teste");

        return tipoPagamento;
    }
//-------------------------------- TIPO PRODUTO ---------------------------------------------------------//

    private static void CadastrarTipoProduto() {
        TipoProduto tipoProduto = RetornarTipoProduto();
    }

    private static TipoProduto RetornarTipoProduto() {
        TipoProduto tipoProduto = new TipoProduto();
        tipoProduto.setDescricao("teste");

        return tipoProduto;
    }
//-------------------------- VENDA --------------------------------------------------------------//

    private static void CadastrarVenda() {
        Venda venda = RetornarVenda();
    }

    private static Venda RetornarVenda() {
        Venda venda = new Venda();
        venda.setData(Data_Calendar().getTime());
        venda.setValorTotal(Double.valueOf("123"));
        venda.setPago(Boolean.TRUE);

        venda.setFuncionario(RetornarFuncionario());
        venda.setCliente(RetornarClientePessoaFisica());
        venda.setItemVenda(new ArrayList<ItemVenda>());
        venda.setPagamentos(new ArrayList<Pagamento>());

        return venda;
    }
}
