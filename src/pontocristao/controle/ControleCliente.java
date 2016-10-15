package pontocristao.controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import org.hibernate.*;
import pontocristao.modelo.*;

/**
 *
 * @author Marcondes
 */
public class ControleCliente extends ControleBase {

    public Cliente getCliente() {
        return (Cliente) this.getModelo();
    }

    public void setCliente(Cliente cliente) {
        this.setModelo(cliente);
    }

    public ControleCliente(boolean pessoaFisica) {
        if (pessoaFisica) {
            setModelo(new ClientePessoaFisica());
        } else {
            setModelo(new ClientePessoaJuridica());
        }
        getCliente().setEndereco(new Endereco());
    }

    public List<Cliente> RetornarClientes() {
        String sqlPessoaFisica = "SELECT * FROM ClientePessoaFisica JOIN Cliente ON ClientePessoaFisica.id = Cliente.id WHERE Cliente.excluido = false";
        String sqlPessoaJuridica = "SELECT * FROM ClientePessoaJuridica JOIN Cliente ON ClientePessoaJuridica.id = Cliente.id WHERE Cliente.excluido = false";

        Query qPessoaFisica = this.getSessao().createSQLQuery(sqlPessoaFisica).addEntity(ClientePessoaFisica.class);
        Query qPessoaJuridica = this.getSessao().createSQLQuery(sqlPessoaJuridica).addEntity(ClientePessoaJuridica.class);

        List<ClientePessoaFisica> clientesPessoaFisica = qPessoaFisica.list();
        List<ClientePessoaJuridica> clientesPessoaJuridica = qPessoaJuridica.list();

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.addAll(clientesPessoaFisica);
        clientes.addAll(clientesPessoaJuridica);

        Collections.sort(clientes, new Comparator<Cliente>() {
            @Override
            public int compare(Cliente c2, Cliente c1) {
                if (c2.getId() > c1.getId()) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });

        return clientes;
    }

    public List<Cliente> RetornarClientes(String[] camposPesquisa, String textoPesquisa) {
        String sql = "SELECT * FROM Cliente";

        if (camposPesquisa != null && textoPesquisa != null && camposPesquisa.length > 0 && textoPesquisa.length() > 0) {
            sql += " WHERE (";

            for (int i = 0; i < camposPesquisa.length; i++) {
                sql += camposPesquisa[i] + " LIKE '%" + textoPesquisa + "%'";
                if (i + 1 < camposPesquisa.length) {
                    sql += " OR ";
                } else {
                    sql += ") AND excluido = false";
                }
            }
        } else {
            sql += " WHERE excluido = false";
        }

        Query q = this.getSessao().createSQLQuery(sql).addEntity(Cliente.class);
        return (List<Cliente>) q.list();
    }

    public Exception RecuperarCliente(long id) {
        String sql = "SELECT * FROM Cliente WHERE id = " + id;
        Exception erro = null;

        try {
            Query q = this.getSessao().createSQLQuery(sql).addEntity(Cliente.class);
            List resultados = q.list();

            if (resultados.size() == 1) {
                this.setCliente((Cliente) resultados.get(0));
            } else {
                throw new Exception("Não foi possível encontrar o cliente com o id " + id);
            }
        } catch (Exception e) {
            erro = e;
        } finally {
            return erro;
        }
    }

    public Exception Excluir(long id) {
        String sql = "SELECT * FROM Cliente WHERE id = " + id;
        Exception erro = null;

        try {
            Session s = getSessao();
            Query q = s.createSQLQuery(sql).addEntity(Cliente.class);
            List resultados = q.list();

            if (resultados.size() == 1) {
                Cliente cliente = (Cliente) resultados.get(0);
                cliente.setExcluido(true);

                Transaction transacao = s.getTransaction();

                transacao.begin();
                s.save(cliente);
                transacao.commit();

            } else {
                throw new Exception("Não foi possível encontrar o cliente com o id " + id);
            }
        } catch (Exception e) {
            erro = e;
        } finally {
            return erro;
        }
    }

    public Exception Salvar() {
        if (getCliente().getId() > 0) {
            return Salvar(getModelo());
        } else {

            getCliente().setDataCadastro(new Date());

            Exception erro = null;
            Session s = getSessao();
            Transaction transacao = s.getTransaction();

            transacao.begin();

            try {
                s.save(getCliente().getEndereco());
                s.save(getCliente());

                transacao.commit();

            } catch (Exception e) {
                transacao.rollback();
                erro = e;
            } finally {
                return erro;
            }
        }

    }
}
