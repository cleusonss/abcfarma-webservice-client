package br.inf.cs.model;

import org.json.JSONArray;

import java.util.Objects;

public class Pagina {

    private String pagina;
    private String limit;
    private Integer total_paginas;
    private String total_itens;
    private Integer total_data;
    private JSONArray data;

    public String getPagina() {
        return this.pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public Integer getTotal_paginas() {
        return total_paginas;
    }

    public void setTotal_paginas(Integer total_paginas) {
        this.total_paginas = total_paginas;
    }

    public String getTotal_itens() {
        return total_itens;
    }

    public void setTotal_itens(String total_itens) {
        this.total_itens = total_itens;
    }

    public Integer getTotal_data(int total_data) {
        return this.total_data;
    }

    public void setTotal_data(Integer total_data) {
        this.total_data = total_data;
    }

    public JSONArray getData() {
        return data;
    }

    public void setData(JSONArray data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagina pagina1 = (Pagina) o;
        return Objects.equals(pagina, pagina1.pagina) && Objects.equals(limit, pagina1.limit) && Objects.equals(total_paginas, pagina1.total_paginas) && Objects.equals(total_itens, pagina1.total_itens) && Objects.equals(total_data, pagina1.total_data) && Objects.equals(data, pagina1.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pagina, limit, total_paginas, total_itens, total_data, data);
    }

    public Pagina() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
