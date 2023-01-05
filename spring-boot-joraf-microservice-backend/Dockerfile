### BUILD image
FROM openjdk:17-bullseye
LABEL "description"="JORAF API"
LABEL version="1.0"
LABEL maintainer="infos@joraf.net"

EXPOSE 8080
COPY target/spring-boot-joraf-microservice-backend-0.0.1-SNAPSHOT.jar joraf-api.jar
ENTRYPOINT ["java", "-jar", "/joraf-api.jar"]