FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  eureka-server-1.0.jar eureka-server.jar
RUN sh -c 'touch /eureka-server.jar'
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-server.jar"]
