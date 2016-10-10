FROM java:8
VOLUME /tmp
ADD  booking-service-api-gateway-1.0.jar booking-service-api-gateway.jar
RUN sh -c 'touch /booking-service-api-gateway.jar'
EXPOSE 8065
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-jar","/booking-service-api-gateway.jar"]
