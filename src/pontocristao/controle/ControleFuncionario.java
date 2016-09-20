/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.controle;

import java.util.List;
import org.hibernate.*;
import pontocristao.modelo.*;

/**
 *
 * @author Marcondes
 */
public class ControleFuncionario extends ControleBase {
    
    public Funcionario getFuncionario() {
        return (Funcionario) this.getModelo();
    }

    public void setFuncionario(Funcionario funcionario) {
        this.setModelo(funcionario);
    }
    
    public Exception RecuperarFuncionario(long id)
    {
        String sql = "SELECT * FROM Funcionario WHERE id = " + id;
        Exception erro = null;
        
        try {
            Query q = this.getSessao().createSQLQuery(sql).addEntity(Funcionario.class);
            List resultados = q.list();
            
            if (resultados.size() == 1) {
                this.setFuncionario((Funcionario) resultados.get(0));
            } else {
                throw new Exception("Não foi possível encontrar o funcionário com o id " + id);
            }
        } catch (Exception e) {
            erro = e;
        } finally {
            return erro;
        }
    }
    
    public Exception Salvar() {
        return Salvar(getModelo());
    }
}
