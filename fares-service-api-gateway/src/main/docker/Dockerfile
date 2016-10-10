FROM java:8
VOLUME /tmp
ADD  fares-service-api-gateway-1.0.jar fares-services-api-gateway.jar
RUN sh -c 'touch /fares-services-api-gateway.jar'
EXPOSE 8085
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/web-app.jar"]
