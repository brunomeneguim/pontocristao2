/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

/**
 *
 * @author marco
 */
public class MovimentacaoCaixaContaPagar extends MovimentacaoCaixaSaida {

    private ContaPagar contaPagar;

    public ContaPagar getContaPagar() {
        return contaPagar;
    }

    public void setContaPagar(ContaPagar contaPagar) {
        this.contaPagar = contaPagar;
    }
}
