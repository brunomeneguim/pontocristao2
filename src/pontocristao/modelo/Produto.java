/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

import java.util.Date;

/**
 *
 * @author marco
 */
public class Produto extends ModeloBase {
    private String nome;
    private Double valorVenda;
    private Integer quantidade;
    private Date dataCadastro;
    private Fornecedor fornecedor;
    private TipoProduto tipoProduto;
}
