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
public class TabelaPrecoLocacao extends ModeloBase{
    private Double valorNormal;

    public Double getValorNormal() {
        return valorNormal;
    }

    public void setValorNormal(Double valorNormal) {
        this.valorNormal = valorNormal;
    }

    public Double getValorLancamento() {
        return valorLancamento;
    }

    public void setValorLancamento(Double valorLancamento) {
        this.valorLancamento = valorLancamento;
    }

    public Double getValorMultaDiaria() {
        return valorMultaDiaria;
    }

    public void setValorMultaDiaria(Double valorMultaDiaria) {
        this.valorMultaDiaria = valorMultaDiaria;
    }
    private Double valorLancamento;
    private Double valorMultaDiaria;
}
