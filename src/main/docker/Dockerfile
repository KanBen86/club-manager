FROM adoptopenjdk:jdk-10.0.2+13

RUN apt-get update && apt-get install -y vim

VOLUME /tmp

COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]