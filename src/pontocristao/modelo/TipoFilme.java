/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author marco
 */
@Entity
public class TipoFilme extends ModeloBase {

    @Column(nullable = false)
    private String descricao;

    @OneToMany(mappedBy = "tipoFilme")
    private Set<Filme> filmes = new HashSet<Filme>(0);
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
        public Set<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(Set<Filme> filmes) {
        this.filmes = filmes;
    }
}
