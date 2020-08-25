FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  config-service-1.0.jar config-service.jar
RUN sh -c 'touch /config-service.jar'
EXPOSE 8888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config-service.jar"]
