package pontocristao.controle;

import pontocristao.modelo.*;

/**
 *
 * @author Marcondes
 */
public abstract class ControleBase {

    public Exception Salvar(ModeloBase modelo) {
        Boolean salvou = true;

        if (salvou) {
            return null;
        } else {
            return new Exception("Não foi possível salvar");
        }
    }

}
