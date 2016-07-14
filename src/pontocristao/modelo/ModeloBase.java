/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author marco
 */
@MappedSuperclass()
public abstract class ModeloBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, columnDefinition = "tinyint default false")
    private Boolean excluido;

    public long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
        public Boolean getExcluido() {
        return excluido;
    }

    public void setExcluido(Boolean excluido) {
        this.excluido = excluido;
    }
}
