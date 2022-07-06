FROM maven:latest
RUN mkdir -p /client && cd /client && git clone https://github.com/cleusonss/abcfarma-webservice-client.git .
WORKDIR /client
RUN mvn -B -f /client/pom.xml dependency:resolve clean compile exec:java