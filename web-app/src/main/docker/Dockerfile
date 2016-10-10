FROM java:8
VOLUME /tmp
ADD  web-app-1.0.jar web-app.jar
RUN sh -c 'touch /web-app.jar'
EXPOSE 8001
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/web-app.jar"]
