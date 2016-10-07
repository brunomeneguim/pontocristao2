package pontocristao.util;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.*;

/**
 *
 * @author Marcondes
 */
public class Utilidades {

    public static void setMascara(String mascara, JFormattedTextField campo) {
        try {
            MaskFormatter mask = new MaskFormatter(mascara);
            mask.install(campo);
        } catch (java.text.ParseException ex) {
            MostrarMensagemErro(ex);
        }
    }
    
    public static Boolean MostrarMensagemPergunta(String titulo, String texto, Boolean padraoSim) {
        Object[] botoes = {"Sim", "Não"};
        int indicePadrao = 0;
        if (!padraoSim) {
            indicePadrao = 1;
        }
        
        int resposta = JOptionPane.showOptionDialog(null, texto, titulo, JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[indicePadrao]);
        
        return resposta == 0;
    }

    public static void MostrarMensagemErro(Exception erro) {
        Object[] botoes = {"Ok"};
        JOptionPane.showOptionDialog(null, erro.getMessage(), "Ocorreu um erro inesperado!", JOptionPane.DEFAULT_OPTION,
                JOptionPane.ERROR, null, botoes, botoes[0]);
    }
}
