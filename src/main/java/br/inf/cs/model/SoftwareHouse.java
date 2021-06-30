package br.inf.cs.model;

import java.util.Objects;

public class SoftwareHouse {

    private String cnpj;

    public SoftwareHouse() {
    }

    public SoftwareHouse(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public SoftwareHouse cnpj(String cnpj) {
        setCnpj(cnpj);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SoftwareHouse)) {
            return false;
        }
        SoftwareHouse softwareHouse = (SoftwareHouse) o;
        return Objects.equals(cnpj, softwareHouse.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cnpj);
    }

    @Override
    public String toString() {
        return "{" + " cnpj='" + getCnpj() + "'" + "}";
    }

}