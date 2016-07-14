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
public class TipoContaPagar extends ModeloBase {

    @Column(nullable = false)
    private String descricao;
    
    @OneToMany(mappedBy = "tipoContaPagar")
    private Set<ContaPagar> contasPagar = new HashSet<ContaPagar>(0);

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
        public Set<ContaPagar> getContasPagar() {
        return contasPagar;
    }

    public void setContasPagar(Set<ContaPagar> contasPagar) {
        this.contasPagar = contasPagar;
    }
}
