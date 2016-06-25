/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

/**
 *
 * @author marco
 */
public class CodigoBarrasProprio extends ModeloBase {

    private Integer ultimoCodigo;
    private String padrao;

    public Integer getUltimoCodigo() {
        return ultimoCodigo;
    }

    public void setUltimoCodigo(Integer ultimoCodigo) {
        this.ultimoCodigo = ultimoCodigo;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

}
