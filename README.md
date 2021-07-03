# ABCFARMA Webservice Client
---
 ![](https://img.shields.io/badge/Java-11-green?logo=Java&style=flat)
 ![](https://img.shields.io/badge/Maven-3.6.0-green?logo=ApacheMaven&style=flat)
 
 Consome webservice ABCFARMA e atualiza um banco de dados.

 ### Instalação
 ---

 1. No terminal clone o projeto
	```shell 
	git clone https://github.com/cleusonss/abcfarma-api-client.git 
	```

 2. Entre na pasta do projeto
	```shell
	cd abcfarma-api-client 
	```
 3. Renomei o ```configuration_template.properties``` para ```configuration.properties```


 4. Insira os valores das variáveis no arquivo ```configuration.properties```


 5. Execute a aplicação
	```shell
	mvn clean compile exec:java 
	```


 ### Versões Suportadas
 ---
 - Java 11 e superior
 - Maven 3.6.0 e superior


 ### Resolvendo Problemas
 ---
 1. MS SQL Server e SSL
 > Habilite o TLSv1 e TLSv.1.1
