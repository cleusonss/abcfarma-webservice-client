# ABCFARMA Webservice Client
---
 [![Java](https://img.shields.io/badge/Java-11-blue?logo=Java&style=flat)](https://adoptopenjdk.net/index.html)
 [![Maven](https://img.shields.io/badge/Maven-3.6.0-blue?logo=ApacheMaven&style=flat)](https://maven.apache.org/index.html)
 ![Snyk](https://img.shields.io/badge/Snyk-passed-green?logo=Snyk&style=flat)

 Consume the ABCFARMA webservice and update a database.

<p align="center">
 <a href="#Installation">Installation</a> •
 <a href="#Configuration">Configuration</a> •
 <a href="#Requirements">Requirements</a> •
 <a href="#Troubleshooting ">Troubleshooting</a> •
 <a href="#Author">Author</a>
</p>

 #### Installation
 ----

 1. Clone this project
	```shell 
	git clone https://github.com/cleusonss/abcfarma-api-client.git 
	```

 2. Enter the project directory
	```shell
	cd abcfarma-api-client 
	```
 3. Rename `configuration_template.properties` to `configuration.properties`


 4. Insert que vars values into `configuration.properties` file


 5. Execute the application
	```shell
	mvn clean compile exec:java 
	```
 
 #### Configuration
 ----
 You can configure the following parameters inside the `configuration.properties`. All the parameters are mandatory.

   ###### ABCFARMA Associated data
   *`cnpj`* : Associated CNPJ

   *`senha`* : Associated password

   *`cnpj_sh`* : Software House CNPJ



   ###### ABCFARMA Associated data
   *`server`* : Database server IP address ou FQDN

   *`port`* : Database server port

   *`name`* : Database name

   *`user`* : Database username

   *`password`* : Database user password

 #### Requirements
 -----
 - [Java 11](https://adoptopenjdk.net/index.html) e superior
 - [Maven 3.6.0](https://maven.apache.org/index.html) e superior


 #### Troubleshooting
 ----
 1. MS SQL Server and SSL
 > [Enable the TLSv1.0](https://asyncstream.com/tutorials/java-tlsv10-not-accepted-by-client-preferences/)


#### Author
----
Made with ❤ by Cleuson Santos 👋🏽 Make a contact!

[![Twitter Badge](https://img.shields.io/badge/-@cleusonss-1ca0f1?style=flat-square&labelColor=1ca0f1&logo=twitter&logoColor=white&link=https://twitter.com/cleusonss)](https://twitter.com/cleusonss) 
[![Linkedin Badge](https://img.shields.io/badge/-CleusonSantos-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/cleuson-santos-7391aa53/)](https://www.linkedin.com/in/cleuson-santos-7391aa53/)
[![Gmail Badge](https://img.shields.io/badge/-cleusonss@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:cleusonss@gmail.com)](mailto:cleusonss@gmail.com)
