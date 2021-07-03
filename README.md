# ABCFARMA Webservice Client
---
 [[!Build Status]
 (https://img.shields.io/appveyor/ci/thiagoloureiro/netcore-jwt-integrator-extension/master.svg)] (https://ci.appveyor.com/project/thiagoloureiro/netcore-jwt-integrator-extension)
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
