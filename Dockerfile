FROM openjdk:8
RUN mkdir app
ADD target/promotion-service-0.0.1-SNAPSHOT.jar app/docker-promotion-service.jar
WORKDIR app
RUN "pwd"
RUN "ls"
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "docker-promotion-service.jar"]

