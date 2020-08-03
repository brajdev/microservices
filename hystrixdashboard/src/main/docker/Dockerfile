FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  hystrixdashboard-1.0.jar hystrixdashboard.jar
RUN sh -c 'touch /hystrixdashboard.jar'
EXPOSE 9999
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hystrixdashboard.jar"]
