FROM openjdk:8
ADD target/nickname2-1.0.jar nickname2-1.0.jar
RUN echo 'mvn clean install'
ENTRYPOINT ["java", "-jar","nickname2-1.0.jar"]
EXPOSE 8080