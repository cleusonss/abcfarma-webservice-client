# ABCFARMA Webservice Client
---
 [![Java](https://img.shields.io/badge/Java-11-blue?logo=Java&style=flat)](https://adoptopenjdk.net/index.html)
 [![Maven](https://img.shields.io/badge/Maven-3.6.0-blue?logo=ApacheMaven&style=flat)](https://maven.apache.org/index.html)
 ![Snyk](https://img.shields.io/badge/Snyk-passed-green?logo=Snyk&style=flat)

 Consome webservice ABCFARMA e atualiza um banco de dados.

<p align="center">
 <a href="#Instalação">Instalação</a> •
 <a href="#Versões Suportadas">Versões Suportadas</a> • 
 <a href="#Resolvendo Problemas">Resolvendo Problemas</a> •
 <a href="#autor">Autor</a>
</p>

 #### Instalação
 ----

 1. Clone este projeto
	```shell 
	git clone https://github.com/cleusonss/abcfarma-api-client.git 
	```

 2. Entre na pasta do projeto
	```shell
	cd abcfarma-api-client 
	```
 3. Renomei o `configuration_template.properties` para `configuration.properties`


 4. Insira os valores das variáveis no arquivo `configuration.properties`


 5. Execute a aplicação
	```shell
	mvn clean compile exec:java 
	```


 #### Versões Suportadas
 -----
 - [Java 11](https://adoptopenjdk.net/index.html) e superior
 - [Maven 3.6.0](https://maven.apache.org/index.html) e superior


 #### Resolvendo Problemas
 ----
 1. MS SQL Server e SSL
 > [Habilite o TLSv1.0](https://asyncstream.com/tutorials/java-tlsv10-not-accepted-by-client-preferences/)

#### Autor
----
Feito com ❤️ por Cleuson Santos 👋🏽 Entre em contato!

[![Twitter Badge](https://img.shields.io/badge/-@cleusonss-1ca0f1?style=flat-square&labelColor=1ca0f1&logo=twitter&logoColor=white&link=https://twitter.com/tgmarinho)](https://twitter.com/tgmarinho) 
[![Linkedin Badge](https://img.shields.io/badge/-CleusonSantos-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/tgmarinho/)](https://www.linkedin.com/in/tgmarinho/)
[![Gmail Badge](https://img.shields.io/badge/-cleusonss@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:tgmarinho@gmail.com)](mailto:tgmarinho@gmail.com)
