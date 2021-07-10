package br.inf.cs.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class ProdutoPmc implements Serializable {

    private static final long serialVersionUID = 1L;

    Integer prod_cod;
    Float aliquota;
    Float preco_maximo_consumidor;
    Date ultima_alteracao;

    public ProdutoPmc() {}

    public Integer getProd_cod() {
        return prod_cod;
    }

    public void setProd_cod(Integer prod_cod) {
        this.prod_cod = prod_cod;
    }

    public Float getAliquota() {
        return aliquota;
    }

    public void setAliquota(Float aliquota) {
        this.aliquota = aliquota;
    }

    public Float getPreco_maximo_consumidor() {
        return preco_maximo_consumidor;
    }

    public void setPreco_maximo_consumidor(Float preco_maximo_consumidor) {
        this.preco_maximo_consumidor = preco_maximo_consumidor;
    }

    public Date getUltima_alteracao() {
        return ultima_alteracao;
    }

    public void setUltima_alteracao(Date ultima_alteracao) {
        this.ultima_alteracao = ultima_alteracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoPmc that = (ProdutoPmc) o;
        return Objects.equals(prod_cod, that.prod_cod) && Objects.equals(aliquota, that.aliquota) && Objects.equals(preco_maximo_consumidor, that.preco_maximo_consumidor) && Objects.equals(ultima_alteracao, that.ultima_alteracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prod_cod, aliquota, preco_maximo_consumidor, ultima_alteracao);
    }
}
