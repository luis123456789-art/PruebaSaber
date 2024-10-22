FROM openjdk:17
COPY "./target/pruebaSaber-1.jar" "app.jar"
EXPOSE "8036"
ENTRYPOINT [ "java", "-jar", "app.jar" ]
