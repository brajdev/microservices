FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  search-service-1.0.jar search-service.jar
RUN sh -c 'touch /search-service.jar'
EXPOSE 8090
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/search-service.jar"]

