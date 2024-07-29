FROM eclipse-temurin:17-jdk
EXPOSE 2238
ADD target/mysqldoc-0.0.1-SNAPSHOT.jar mysqldoc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mysqldoc-0.0.1-SNAPSHOT.jar"]