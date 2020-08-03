FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  checkin-service-api-gateway-1.0.jar checkin-service-api-gateway.jar
RUN sh -c 'touch /checkin-service-api-gateway.jar'
EXPOSE 8075
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/checkin-service-api-gateway.jar"]
