#FROM maven:3.5.4-jdk-8-alpine

#LABEL maintainer="Dav" name="demo" version="v1.0" license=""

#COPY src /usr/src/demo/src
#COPY pom.xml /usr/src/demo
#RUN mvn -f /usr/src/demo/pom.xml clean package -U -Dmaven.test.skip=true

#EXPOSE 8085
#ENTRYPOINT ["java", "-jar", "/usr/src/demo/target/demo-0.0.1-SNAPSHOT.jar"]
