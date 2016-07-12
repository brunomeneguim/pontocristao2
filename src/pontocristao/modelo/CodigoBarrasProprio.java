/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

import javax.persistence.*;

/**
 *
 * @author marco
 */

@Entity
public class CodigoBarrasProprio extends ModeloBase {

    @Column(nullable = false)
    private Integer ultimoCodigo;
    @Column(nullable = false)
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
