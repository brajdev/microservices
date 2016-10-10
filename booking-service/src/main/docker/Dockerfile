FROM java:8
VOLUME /tmp
ADD  booking-service-1.0.jar booking-service.jar
RUN sh -c 'touch /booking-service.jar'
EXPOSE 8060
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/booking-service.jar"]
