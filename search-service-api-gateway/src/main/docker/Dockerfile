FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  search-service-api-gateway-1.0.jar search-service-api-gateway.jar
RUN sh -c 'touch /search-service-api-gateway.jar'
EXPOSE 8095
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/search-service-api-gateway.jar"]
