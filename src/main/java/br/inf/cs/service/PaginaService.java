/***
 * Copyright 2021 Cleuson Santos <cleusonss@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ***/

package br.inf.cs.service;

import br.inf.cs.model.Pagina;
import org.json.JSONObject;

public class PaginaService {

    private Pagina pagina = new Pagina();

    public Pagina getPagina() {
        return this.pagina;
    }

    public void setPagina(JSONObject jsonObject) {

        if (isOK(jsonObject)) {
            this.pagina.setPagina(jsonObject.getString("pagina"));
            this.pagina.setLimit(jsonObject.getString("limit"));
            this.pagina.setTotal_paginas(jsonObject.getInt("total_paginas"));
            this.pagina.setTotal_itens(jsonObject.getString("total_itens"));
            this.pagina.getTotal_data(jsonObject.getInt("total_data"));
            this.pagina.setData(jsonObject.getJSONArray("data"));
        } else {
            if (isError(jsonObject)) {
                System.out.println(jsonObject.getString("status"));
                System.out.println(jsonObject.getString("error_message"));
                System.out.println(jsonObject.getString("error_code"));
                System.out.println(jsonObject.getString("link"));
            }
        }
    }

    public Boolean isOK(JSONObject jsonObject) {
        if (!jsonObject.has("pagina")) {
            return false;
        }

        if (!jsonObject.has("limit")) {
            return false;
        }

        if (!jsonObject.has("total_paginas")) {
            return false;
        }

        if (!jsonObject.has("total_itens")) {
            return false;
        }

        if (!jsonObject.has("total_itens")) {
            return false;
        }
        if (!jsonObject.has("data")) {
            return false;
        }
        return true;
    }

    public Boolean isError(JSONObject jsonObject) {
        if (!jsonObject.has("data")) {
            return false;
        }
        if (!jsonObject.has("error_code")) {
            return false;
        }
        if (!jsonObject.has("status")) {
            return false;
        }
        if (!jsonObject.has("error_message")) {
            return false;
        }
        if (!jsonObject.has("link")) {
            return false;
        }
        return true;
    }
}
