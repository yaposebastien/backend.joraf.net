
FROM openjdk:17-bullseye
LABEL "description"="JORAF API"
LABEL version="1.0.1"
LABEL maintainer="infos@joraf.net"

WORKDIR /joraf
COPY target/springboot-joraf-api-backend-1.0.1.jar joraf/joraf-api.jar
ENTRYPOINT ["java", "-jar", "joraf/joraf-api.jar"]
EXPOSE 8080