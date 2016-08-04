package pontocristao.teste;

import java.util.*;
import org.hibernate.Session;
import pontocristao.modelo.*;
import pontocristao.util.HibernateUtil;

/**
 *
 * @author Marcondes
 */
public class PopularBancoTeste {

    public static void Popular() {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.close();

            transacao.begin();

            CodigoBarrasProprio codigoBarras = RetornarNovoCodigoBarrasProprio();

            //Salva um novo código de barras próprio
            sessao.save(codigoBarras);

            Caixa caixa = RetornarNovoCaixa();

            //Salva um novo caixa
            sessao.save(caixa);

            TipoContaPagar tipoContaPagar = RetornarNovoTipoContaPagar();

            //Salva um novo tipo de conta a pagar
            sessao.save(tipoContaPagar);

            ContaPagar contaPagar = RetornarNovaContaPagar();
            contaPagar.setTipoContaPagar(tipoContaPagar);

            //Salva uma nova conta a pagar
            sessao.save(contaPagar);

            Fornecedor fornecedor = RetornarNovoFornecedor();

            //Salva um novo fornecedor
            sessao.save(fornecedor);

            TipoProduto tipoProduto = RetornarNovoTipoProduto();

            //Salva um novo tipo de produto
            sessao.save(tipoProduto);

            Produto produto = RetornarNovoProduto();
            produto.setFornecedor(fornecedor);
            produto.setTipoProduto(tipoProduto);

            //Salva um novo produto
            sessao.save(produto);

            TipoFilme tipoFilme = RetornarTipoFilme();

            //Salva um novo tipo de filme
            sessao.save(tipoFilme);

            Filme filme = RetornarNovoFilme();
            filme.setTipoFilme(tipoFilme);
            filme.setTipoProduto(tipoProduto);

            //Salva um novo filme
            sessao.save(filme);

            TabelaPrecoLocacao tabelaPrecoLocacao = RetornarNovaTabelaPrecoLocacao();

            //Salva uma nova tabela de preço de locação
            sessao.save(tabelaPrecoLocacao);

            Endereco enderecoFuncionario = RetornarNovoEndereco();

            //Salva um novo endereço para o funcionário
            sessao.save(enderecoFuncionario);

            Funcionario funcionario = RetornarNovoFuncionario();
            funcionario.setEndereco(enderecoFuncionario);

            //Salva um novo funcionário
            sessao.save(funcionario);

            Endereco enderecoClientePessoaFisica = RetornarNovoEndereco();

            //Salva um novo endereço para o cliente pessoa física
            sessao.save(enderecoClientePessoaFisica);

            ClientePessoaFisica clientePessoaFisica = RetornarNovoClientePessoaFisica();
            clientePessoaFisica.setEndereco(enderecoClientePessoaFisica);

            //Salva um novo cliente pessoa física
            sessao.save(clientePessoaFisica);

            Dependente dependenteClientePessoaFisica = RetornarNovoDependente();
            dependenteClientePessoaFisica.setCliente(clientePessoaFisica);

            //Salvar um novo dependente para o cliente pessoa física
            sessao.save(dependenteClientePessoaFisica);

            Endereco enderecoClientePessoaJuridica = RetornarNovoEndereco();

            //Salva um novo endereço para o cliente pessoa jurídica
            sessao.save(enderecoClientePessoaJuridica);

            ClientePessoaJuridica clientePessoaJuridica = RetornarNovoClientePessoaJuridica();
            clientePessoaJuridica.setEndereco(enderecoClientePessoaJuridica);

            //Salva um novo cliente pessoa jurídica
            sessao.save(clientePessoaJuridica);

            Dependente dependenteClientePessoaJuridica = RetornarNovoDependente();
            dependenteClientePessoaFisica.setCliente(clientePessoaJuridica);

            //Salvar um novo dependente para o cliente pessoa física
            sessao.save(dependenteClientePessoaJuridica);

            Locacao locacao = RetornarNovaLocacao();
            locacao.setCliente(clientePessoaFisica);
            locacao.setFuncionario(funcionario);

            //Salva uma nova locação
            sessao.save(locacao);

            ItemLocacao itemLocacao = RetornarNovoItemLocacao();
            itemLocacao.setFilme(filme);
            itemLocacao.setLocacao(locacao);

            //Salva um novo item de locação
            sessao.save(itemLocacao);

            TipoPagamento tipoPagamento = RetornarNovoTipoPagamento();

            //Salva um novo tipo de pagamento
            sessao.save(tipoPagamento);

            PagamentoLocacao pagamentoLocacao = RetornarNovoPagamentoLocacao();
            pagamentoLocacao.setLocacao(locacao);

            //Salva um novo pagamento de locacao
            sessao.save(pagamentoLocacao);

            MovimentacaoCaixaLocacao movimentacaoCaixaLocacao = RetornarNovaMovimentacaoCaixaLocacao();
            movimentacaoCaixaLocacao.setCaixa(caixa);
            movimentacaoCaixaLocacao.setFuncionario(funcionario);
            movimentacaoCaixaLocacao.setLocacao(locacao);

            //Salva uma nova movimentação de caixa de locação
            sessao.save(movimentacaoCaixaLocacao);

            transacao.commit();
            sessao.close();
        } catch (Exception e) {
            Exception erro = e;
        }

    }

    private static void CadastrarCaixa() {
        Caixa caixa = new Caixa();
        caixa.setSaldo(1523.79);
        caixa.setMovimentacoes(new HashSet<MovimentacaoCaixa>());
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
        clientePessoaFisica.setDependentes(new HashSet<Dependente>());
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
        clientePessoaJuridica.setDependentes(new HashSet<Dependente>());
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
        locacao.setItemLocacao(new HashSet<ItemLocacao>());
        //locacao.setPagamentos(new HashSet<Pagamento>());

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
        movimentacaoCaixaVenda.setFaturado(true);
        movimentacaoCaixaVenda.setValor(Double.valueOf("123"));

        movimentacaoCaixaVenda.setVenda(RetornarVenda());
        movimentacaoCaixaVenda.setFuncionario(RetornarFuncionario());
    }

    private static void CadastrarPagamento() {
//        Pagamento pagamento = new Pagamento();
//        pagamento.setValor(Double.valueOf("123"));
//        pagamento.setData(Data_Calendar().getTime());
//        pagamento.setDescricao("teste");
//
//        pagamento.setTipoPagamento(RetornarTipoPagamento());
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
        produto.setQuantidade(5);
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
        venda.setItemVenda(new HashSet<ItemVenda>());
        //venda.setPagamentos(new HashSet<Pagamento>());

        return venda;
    }
}
