FROM openjdk:8
ADD target/ec2Application-0.0.1-SNAPSHOT.jar ec2Application-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ec2Application-0.0.1-SNAPSHOT.jar"]
