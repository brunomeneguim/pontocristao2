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
public class Locacao extends ModeloBase {

    private Date data;
    private List<ItemLocacao> ItensLocacao;
    private Double valorTotal;
    private Funcionario funcionario;
    private Cliente cliente;
    private Boolean pago;
    private List<Pagamento> pagamentos;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemLocacao> getItensLocacao() {
        return ItensLocacao;
    }

    public void setItensLocacao(List<ItemLocacao> ItensLocacao) {
        this.ItensLocacao = ItensLocacao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

}
