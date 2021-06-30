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
