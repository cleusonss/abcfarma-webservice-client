/*
 * Copyright 2021 Cleuson Santos <cleusonss@gmail.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 */

package br.inf.cs.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "principio_ativo")
public class PrincipioAtivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    @Column(name="codigo")
    private Integer codigo;

    @JsonProperty("nome")
    @Column(name="nome")
    private String nome;

    @JsonProperty("dataExclusao")
    @Column(name="data_exclusao")
    private Date dataExclusao;

    @JsonProperty("dcb")
    @Column(name="dcb")
    private String dcb;

    @JsonProperty("dataUltimaAlteracao")
    @Column(name="data_ultima_alteracao")
    private Date dataUltimaAlteracao;

    public PrincipioAtivo() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @SuppressWarnings("unused")
    public Date getDataExclusao() {
        return dataExclusao;
    }

    @SuppressWarnings("unused")
    public void setDataExclusao(Date dataExclusao) {
        this.dataExclusao = dataExclusao;
    }

    public String getDcb() {
        return dcb;
    }

    public void setDcb(String dcb) {
        this.dcb = dcb;
    }

    @SuppressWarnings("unused")
    public Date getDataUltimaAlteracao() {
        return dataUltimaAlteracao;
    }

    @SuppressWarnings("unused")
    public void setDataUltimaAlteracao(Date dataUltimaAlteracao) {
        this.dataUltimaAlteracao = dataUltimaAlteracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrincipioAtivo that = (PrincipioAtivo) o;
        return Objects.equals(codigo, that.codigo) && Objects.equals(nome, that.nome) && Objects.equals(dataExclusao, that.dataExclusao) && Objects.equals(dcb, that.dcb) && Objects.equals(dataUltimaAlteracao, that.dataUltimaAlteracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, dataExclusao, dcb, dataUltimaAlteracao);
    }
}
