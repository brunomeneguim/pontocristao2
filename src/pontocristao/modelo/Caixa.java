/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

import java.util.List;

/**
 *
 * @author marco
 */
public class Caixa extends ModeloBase {

    private List<MovimentacaoCaixa> movimentacoes;
    private Double saldo;

    public List<MovimentacaoCaixa> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<MovimentacaoCaixa> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
