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
public class Filme extends Produto{
    private Boolean lancamento;

    public Boolean getLancamento() {
        return lancamento;
    }

    public void setLancamento(Boolean lancamento) {
        this.lancamento = lancamento;
    }

    public TipoFilme getTipoFilme() {
        return tipoFilme;
    }

    public void setTipoFilme(TipoFilme tipoFilme) {
        this.tipoFilme = tipoFilme;
    }
    private TipoFilme tipoFilme;
}
