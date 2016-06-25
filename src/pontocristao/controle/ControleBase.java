/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.controle;

import pontocristao.modelo.*;
/**
 *
 * @author marco
 */
public abstract class ControleBase {
    
    public Exception Salvar(ModeloBase modelo)
    {
        Boolean salvou = true;
        
        if (salvou) {
            return null;
        }
        else {
            return new Exception("Não foi possível salvar");
        }
    }
    
}
