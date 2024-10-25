FROM openjdk:17
COPY "./target/pruebaSaber-1.jar" "app.jar"
EXPOSE 5577
ENTRYPOINT [ "java", "-jar", "app.jar" ]