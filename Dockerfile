FROM openjdk:8
COPY C:/Users/dariop/.jenkins/workspace/ES2-P1-Compile/ES2-2020-EIC1-03-P1/target/ES2-2020-EIC1-03-P1-1.0.jar /usr/hello-world-app/
WORKDIR /usr/hello-world-app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ES2-2020-EIC1-03-P1-1.0.jar"]
