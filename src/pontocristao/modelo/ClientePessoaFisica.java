/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

import javax.persistence.*;

/**
 *
 * @author marco
 */
@Entity
public class ClientePessoaFisica extends Cliente{
    
    @Column(nullable = false)
    private String rg;
    @Column(nullable = false)
    private String cpf;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
