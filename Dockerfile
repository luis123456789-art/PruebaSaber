FROM openjdk:17
COPY "./tarjet/pruebaSaber-1.jar" "app.jar"
EXPOSE 5577
ENTRYPOINT [ "java", "-jar", "app.jar" ]