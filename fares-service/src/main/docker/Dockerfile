FROM java:8
VOLUME /tmp
ADD  fares-service-1.0.jar fares-service.jar
RUN sh -c 'touch /fares-service.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/fares-service.jar"]
