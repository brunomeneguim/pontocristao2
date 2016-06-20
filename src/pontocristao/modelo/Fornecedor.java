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
public class Fornecedor extends ModeloBase{
    private String nomeFantasia;
    private String telefone;
    private String celular;
    private String descricao;
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;
    private List<Produto> produtos;
}
