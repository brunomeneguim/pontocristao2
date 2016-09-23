package pontocristao.controle;

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

    public ControleCliente() {
        setModelo(new Cliente() {});
        getCliente().setEndereco(new Endereco());
    }

    public List<Cliente> RetornarClientes() {
        String sql = "SELECT * FROM Cliente";
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
