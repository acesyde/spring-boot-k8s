FROM gradle:5.3-jdk11-slim as build
WORKDIR /home/source/java
COPY . /home/source/java
USER root
RUN chown -R gradle /home/source/java
USER gradle
RUN gradle clean build

FROM openjdk:11-jre-slim
WORKDIR /home/application/java
COPY --from=build "/home/source/java/build/libs/com.mydrive-0.0.1-SNAPSHOT.jar" .
ENTRYPOINT [ "java", "-jar", "/home/application/java/com.mydrive-0.0.1-SNAPSHOT.jar"]