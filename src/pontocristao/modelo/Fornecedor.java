package pontocristao.modelo;

import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Marcondes
 */
@Entity
public class Fornecedor extends ModeloBase {

    @Column(nullable = false)
    private String nomeFantasia;

    @Column(nullable = false)
    private String telefone;

    private String celular;

    private String descricao;

    @Column(nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private String razaoSocial;

    @Column(nullable = false)
    private String inscricaoEstadual;

    @OneToMany(mappedBy = "fornecedor")
    private Set<Produto> produtos = new HashSet<Produto>(0);

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

}
