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

package br.inf.cs.controller;

import br.inf.cs.model.Pagina;
import br.inf.cs.service.PaginaService;
import br.inf.cs.service.ProductService;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileController {

    ProductService productService = new ProductService();

    public FileController() {
    }

    public String read(Integer i) throws IOException {
        String fileName = "abc_farma_pagina_" + i + ".json";
        return Files.readString(Paths.get(fileName));
    }

    public Pagina processPagina(int i) throws IOException {
        String content = read(i);
        JSONObject jsonObject = new JSONObject(content);

        PaginaService paginaService = new PaginaService();
        if (paginaService.isError(jsonObject)) {
            System.exit(0);
        }
        paginaService.setPagina(jsonObject);
        return paginaService.getPagina();
    }

    public void processAllPaginas() throws IOException {
        Pagina pagina;
        int i = 1;
        do {
            pagina = processPagina(i);

            System.out.println("Pagina: " + pagina.getPagina() + "/" + pagina.getTotal_paginas());
            productService.setPF17(pagina.getData());
            productService.setPMC17(pagina.getData());
            productService.getCheckRows(pagina.getData());

            i++;
        } while (i <= pagina.getTotal_paginas());
    }
}
