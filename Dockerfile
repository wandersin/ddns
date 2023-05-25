FROM openjdk:17
ADD target/ddns.jar /application/ddns.jar
ENTRYPOINT ["java", "-jar", "/application/ddns.jar"]
EXPOSE 8080