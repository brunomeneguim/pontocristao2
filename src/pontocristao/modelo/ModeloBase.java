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

    public long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
