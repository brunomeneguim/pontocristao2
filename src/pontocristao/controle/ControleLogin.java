/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.controle;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pontocristao.modelo.Funcionario;
import pontocristao.util.Utilidades;

/**
 *
 * @author Marco
 */
public class ControleLogin extends ControleBase{
    
    public Funcionario FazerLogin(String login, String senha)
    {
        Session s = getSessao();
        String sql = "SELECT * FROM Funcionario WHERE excluido = false AND login = '" + login +"' AND senha = '" + senha + "'";
        Query q = s.createSQLQuery(sql).addEntity(Funcionario.class);
        
        List<Funcionario> funcionarios = q.list();
        Funcionario funcionarioLogado = null;
        
        if(login.equals("admin") && senha.equals("admin") && funcionarios.isEmpty())
        {
            funcionarioLogado = new Funcionario();
            funcionarioLogado.setLogin(login);
            funcionarioLogado.setSenha(senha);
            funcionarioLogado.setNome("Administrador");
        }
        else
        {
            if(funcionarios.size() > 0)
            {
                funcionarioLogado = funcionarios.get(0);
            }
            else
            {
                Utilidades.MostrarMensagem("Falha no login", "Nome de usuário ou senha incorretos.");
            }
        }
        
        setModelo(funcionarioLogado);
        
        ControleSistema.FuncionarioLogado = funcionarioLogado;
        
        return funcionarioLogado;
    }
}
