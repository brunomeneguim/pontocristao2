/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

import java.util.*;
import javax.persistence.*;

/**
 *
 * @author marco
 */
@Entity
public class ContaPagar extends ModeloBase {

    @Column(nullable = false)
    private Date data;
    @Column(nullable = false)
    private Date dataVencimento;
    @Column(nullable = false)
    private Double valor;
    @ManyToOne()
    private TipoContaPagar tipoContaPagar;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoContaPagar getTipoContaPagar() {
        return tipoContaPagar;
    }

    public void setTipoContaPagar(TipoContaPagar tipoContaPagar) {
        this.tipoContaPagar = tipoContaPagar;
    }

}
