/*
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
 */

package br.inf.cs.controller;

import br.inf.cs.Runner;
import br.inf.cs.logging.Logger;
import br.inf.cs.model.Pagina;
import br.inf.cs.service.PaginaService;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ApiClientController {

    public List<NameValuePair> getParameters(Integer pagina) {
        List<NameValuePair> parameters = new ArrayList<>();
        parameters.add(new BasicNameValuePair("cnpj_cpf", Runner.associado.getCnpj()));
        parameters.add(new BasicNameValuePair("senha", Runner.associado.getSenha()));
        parameters.add(new BasicNameValuePair("cnpj_sh", Runner.softwareHouse.getCnpj()));
        parameters.add(new BasicNameValuePair("pagina", String.valueOf(pagina)));
        return parameters;
    }

    public String post(String url, List<NameValuePair> parameters) throws IOException {

        HttpPost post = new HttpPost(url);
        post.setEntity(new UrlEncodedFormEntity(parameters));

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(post)) {

            // Retorna String JSON contendo código
            if (response.getStatusLine().getStatusCode() == 200) {
                return EntityUtils.toString(response.getEntity());
            } else {
                return ("error: " + EntityUtils.toString(response.getEntity()));
            }
        }
    }

    public void postAllPaginas() throws IOException {
        PaginaService paginaService = new PaginaService();
        Pagina pagina;
        JSONObject jsonObject;
        String content;
        int i = 1;
        int last;
        do {
            content = this.post(Runner.URI, this.getParameters(i));
            jsonObject = new JSONObject(content);
            if (paginaService.isOK(jsonObject)) {
                paginaService.setPagina(jsonObject);
                pagina = paginaService.getPagina();
                last = pagina.getTotal_paginas();

                Logger.info(this.getClass(), "Pagina: " + pagina.getPagina() + "/" + pagina.getTotal_paginas());
                this.write(i, content);
            } else {
                System.out.println(content);
                last = i;
            }
            i++;
        } while (i <= last);
    }

    public void write(Integer i, String content) {
        try {
            String fileName = "abc_farma_pagina_" + i + ".json";
            Files.writeString(Paths.get(fileName), content);
        } catch (IOException e) {
            Logger.warning(this.getClass(), e.getMessage());
        }
    }
}
