package br.inf.cs.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    @Column(name = "codigo", nullable = false, columnDefinition = "nvarchar")
    private String codigo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "Codigo_barra")
    private Long codigo_barra;

    @Column(name = "quantidade_estoque")
    private Float quantidade_estoque;

    @Column(name = "codigo_ncm")
    private String codigo_ncm;

    @Column(name = "aliquota_abc_farma")
    private Double aliquota_abc_farma;

    @Column(name = "preco_fabricante")
    private Double preco_fabricante;

    public Produto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodigo_barra() {
        return codigo_barra;
    }

    public void setCodigo_barra(Long codigo_barra) {
        this.codigo_barra = codigo_barra;
    }

    public Float getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(Float quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public String getCodigo_ncm() {
        return codigo_ncm;
    }

    public void setCodigo_ncm(String codigo_ncm) {
        this.codigo_ncm = codigo_ncm;
    }

    public Double getAliquota_abc_farma() {
        return aliquota_abc_farma;
    }

    public void setAliquota_abc_farma(Double aliquota_abc_farma) {
        this.aliquota_abc_farma = aliquota_abc_farma;
    }

    public Double getPreco_fabricante() {
        return preco_fabricante;
    }

    public void setPreco_fabricante(Double preco_fabricante) {
        this.preco_fabricante = preco_fabricante;
    }
}
