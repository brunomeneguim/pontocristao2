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
public class Caixa extends ModeloBase {

    @OneToMany(mappedBy = "caixa")
    private Set<MovimentacaoCaixa> movimentacoes = new HashSet<MovimentacaoCaixa>(0);
    @Column(nullable = false)
    private Double saldo;

    public Set<MovimentacaoCaixa> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(Set<MovimentacaoCaixa> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
