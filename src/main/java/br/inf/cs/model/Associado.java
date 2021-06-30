package br.inf.cs.model;

import java.util.Objects;

public class Associado {

    private String cnpj;
    private String senha;

    public Associado() {
    }

    public Associado(String cnpj, String senha) {
        this.cnpj = cnpj;
        this.senha = senha;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Associado cnpj(String cnpj) {
        setCnpj(cnpj);
        return this;
    }

    public Associado senha(String senha) {
        setSenha(senha);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Associado)) {
            return false;
        }
        Associado associado = (Associado) o;
        return Objects.equals(cnpj, associado.cnpj) && Objects.equals(senha, associado.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj, senha);
    }

    @Override
    public String toString() {
        return "{" + " cnpj='" + getCnpj() + "'" + ", senha='" + getSenha() + "'" + "}";
    }

}