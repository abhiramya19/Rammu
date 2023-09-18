FROM openjdk
EXPOSE 9090
ADD target/dem-2-0.0.1-SNAPSHOT.jar cicd.jar
ENTRYPOINT ["java","-jar","cicd.jar"]