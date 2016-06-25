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
 * @author marco
 */
public class Locacao extends ModeloBase{
    private Date data;
    private List<ItemLocacao> ItensLocacao;
    private Double valorTotal;
    private Funcionario funcionario;
    private Cliente cliente;
    private Boolean pago;
    private List<Pagamento> pagamentos; 
    
}
