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
public class Venda extends ModeloBase {

    @Column(nullable = false)
    private Date data;
    
    @OneToMany(mappedBy = "venda")
    private Set<ItemVenda> ItensVenda = new HashSet<ItemVenda>(0);
    
    @Column(nullable = false)
    private Double valorTotal;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Funcionario funcionario;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Cliente cliente;
    
    @Column(nullable = false)
    private Boolean pago;
    
    @OneToMany(mappedBy = "venda")
    private Set<PagamentoVenda> pagamentos = new HashSet<PagamentoVenda>(0);

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Set<ItemVenda> getItemVenda() {
        return ItensVenda;
    }

    public void setItemVenda(Set<ItemVenda> ItensVenda) {
        this.ItensVenda = ItensVenda;
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

    public Set<PagamentoVenda> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Set<PagamentoVenda> pagamentos) {
        this.pagamentos = pagamentos;
    }

}
