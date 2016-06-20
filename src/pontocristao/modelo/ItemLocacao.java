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
public class ItemLocacao extends ModeloBase{
    private Date dataPrevisaoEntrega;
    private Date dataEntrega;
    private Filme filme;
    private Locacao locacao;
}
