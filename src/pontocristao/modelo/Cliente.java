/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Marcondes
 */
public abstract class Cliente extends ModeloBase{
    private String nome;
    private String telefone;
    private String celular;
    private Date dataCadastro;
    private String email;
    private Integer totalLocacoes;
    private Endereco endereco;
    private List<Dependente> dependentes;
}
