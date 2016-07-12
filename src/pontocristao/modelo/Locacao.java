/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontocristao.modelo;

import java.util.*;
import javax.persistence.*;

/**
 *
 * @author marco
 */
@Entity
public class Locacao extends ModeloBase {

    private Date data;
    private Set<ItemLocacao> ItensLocacao = new HashSet<ItemLocacao>(0);
    private Double valorTotal;
    private Funcionario funcionario;
    private Cliente cliente;
    private Boolean pago;
    private Set<Pagamento> pagamentos = new HashSet<Pagamento>(0);

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Set<ItemLocacao> getItemLocacao() {
        return ItensLocacao;
    }

    public void setItemLocacao(Set<ItemLocacao> ItensLocacao) {
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

    public Set<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Set<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

}
