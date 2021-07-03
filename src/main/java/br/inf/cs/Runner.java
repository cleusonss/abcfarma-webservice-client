package br.inf.cs;

import br.inf.cs.controller.ApiClientController;
import br.inf.cs.controller.FileController;
import br.inf.cs.data.ConnectionU;
import br.inf.cs.model.Associado;
import br.inf.cs.model.SoftwareHouse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Runner {

    public static String uri = "http://webserviceabcfarma.org.br/webservice/";
    public static Associado associado = new Associado();
    public static SoftwareHouse softwareHouse = new SoftwareHouse();

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("configuration.properties"));


        Runner.associado.setCnpj(properties.getProperty("cnpj"));
        Runner.associado.setSenha(properties.getProperty("senha"));
        Runner.softwareHouse.setCnpj(properties.getProperty("cnpj_sh"));

        ConnectionU.server = properties.getProperty("server");
        ConnectionU.port = properties.getProperty("port");
        ConnectionU.databasename = properties.getProperty("name");
        ConnectionU.user = properties.getProperty("user");
        ConnectionU.password = properties.getProperty("password");

        ApiClientController apiClientController = new ApiClientController();
        apiClientController.postAllPaginas();

        FileController fileController = new FileController();
        fileController.processAllPaginas();
    }
}
