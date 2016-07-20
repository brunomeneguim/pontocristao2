package pontocristao.util;

import javax.swing.text.*;

/**
 *
 * @author Marcondes
 */
public class Utilidades {

    public MaskFormatter setMascara(String mascara) {
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter(mascara);
        } catch (java.text.ParseException ex) {
        }
        return mask;
    }

}
