# ABCFARMA Webservice Client

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

 ## Installation

 1. Clone this project.
	```shell 
	git clone https://github.com/cleusonss/abcfarma-api-client.git 
	```

 2. Enter the project directory.
	```shell
	cd abcfarma-api-client 
	```
 3. Rename the `configuration_template.properties` to `configuration.properties`


 4. Insert the parameters values into the `configuration.properties` file.


 5. Execute the application.
	```shell
	mvn clean compile exec:java 
	```
 
 ## Configuration
 You can configure the following parameters into the `configuration.properties` file. All the parameters are mandatory.

   ###### ABCFARMA Associated Information
   *`cnpj`* : Associated CNPJ

   *`senha`* : Associated password

   *`cnpj_sh`* : Software House CNPJ



   ###### Database Information
   *`server`* : Database server IP address ou FQDN

   *`port`* : Database server port

   *`name`* : Database name

   *`user`* : Database username

   *`password`* : Database user password

 ## Requirements
 
 - [Java 11](https://adoptopenjdk.net/index.html) and above.
 - [Maven 3.6.0](https://maven.apache.org/index.html) and above.


 ## Troubleshooting
 
 1. MS SQL Server and SSL
 > [Enable the TLSv1.0](https://asyncstream.com/tutorials/java-tlsv10-not-accepted-by-client-preferences/)

 2. ABCFARMA error 500: Access limit exceeded.
 > Contact the ABCFARMA support and request access release.


## Author

Made with ❤ by Cleuson Santos 👋🏽 Make a contact!

[![Twitter Badge](https://img.shields.io/badge/-@cleusonss-1ca0f1?style=flat-square&labelColor=1ca0f1&logo=twitter&logoColor=white&link=https://twitter.com/cleusonss)](https://twitter.com/cleusonss) 
[![Linkedin Badge](https://img.shields.io/badge/-CleusonSantos-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/cleuson-santos-7391aa53/)](https://www.linkedin.com/in/cleuson-santos-7391aa53/)
[![Gmail Badge](https://img.shields.io/badge/-cleusonss@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:cleusonss@gmail.com)](mailto:cleusonss@gmail.com)
