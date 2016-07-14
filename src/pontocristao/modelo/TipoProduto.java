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
public class TipoProduto extends ModeloBase {

    @Column(nullable = false)
    private String descricao;
    @OneToMany(mappedBy = "tipoProduto")
    private Set<Produto> produtos = new HashSet<Produto>(0);

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
        public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }
}
