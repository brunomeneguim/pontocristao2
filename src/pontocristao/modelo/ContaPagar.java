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
public class ContaPagar extends ModeloBase{
    private Date data;
    private Date dataVencimento;
    private Double valor;
    private TipoContaPagar tipoContaPagar;
}
