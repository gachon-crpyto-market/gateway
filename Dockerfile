FROM openjdk:17-alpine
COPY ./build/libs/gachon-crpyto-gateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "app.jar"]