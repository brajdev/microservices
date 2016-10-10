FROM java:8
VOLUME /tmp
ADD  checkin-service-1.0.jar checkin-service.jar
RUN sh -c 'touch /checkin-service.jar'
EXPOSE 8070
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-jar","/checkin-service.jar"]
