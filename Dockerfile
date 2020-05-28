FROM openjdk:8-alpine
COPY ES2-2020-EIC1-03-P1-1.0.jar /usr/hello_world_app/
WORKDIR /usr/hello_world_app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ES2-2020-EIC1-03-P1-1.0.jar"]
