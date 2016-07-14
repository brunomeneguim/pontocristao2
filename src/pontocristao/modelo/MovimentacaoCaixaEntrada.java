/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author marco
 */
@Entity
public abstract class MovimentacaoCaixaEntrada extends MovimentacaoCaixa {

    @Column(nullable = false)
    private Date dataFaturar;
    @Column(nullable = false)
    private Boolean faturado;

    public Date getDataFaturar() {
        return dataFaturar;
    }

    public void setDataFaturar(Date dataFaturar) {
        this.dataFaturar = dataFaturar;
    }

    public Boolean getFaturado() {
        return faturado;
    }

    public void setFaturado(Boolean faturado) {
        this.faturado = faturado;
    }

}
