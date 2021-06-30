package br.inf.cs;

import br.inf.cs.controller.ApiClientController;
import br.inf.cs.controller.FileController;
import br.inf.cs.data.ConnectionU;
import br.inf.cs.model.Associado;
import br.inf.cs.model.SoftwareHouse;

import java.io.IOException;

public class Runner {

    public static String uri = "http://webserviceabcfarma.org.br/webservice/";
    public static Associado associado = new Associado();
    public static SoftwareHouse softwareHouse = new SoftwareHouse();

    public static void main(String[] args) throws IOException {

        Runner.associado.setCnpj("");
        Runner.associado.setSenha("");
        Runner.softwareHouse.setCnpj("");

        ConnectionU.server = "";
        ConnectionU.port = "";
        ConnectionU.databasename = "";
        ConnectionU.user = "";
        ConnectionU.password = "";

        ApiClientController apiClientController = new ApiClientController();
        apiClientController.postAllPaginas();

        FileController fileController = new FileController();
        fileController.processAllPaginas();
    }
}
