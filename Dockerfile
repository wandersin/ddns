FROM openjdk:17
ENV active=local
ADD target/ddns.jar /application/ddns.jar
ENTRYPOINT ["java", "-jar", "/application/Apollo.jar"]
EXPOSE 8080
