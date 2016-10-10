FROM java:8
VOLUME /tmp
ADD  hystrixdashboard-1.0.jar hystrixdashboard.jar
RUN sh -c 'touch /hystrixdashboard.jar'
EXPOSE 9999
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hystrixdashboard.jar"]
