# Usar imagen base de Maven para compilar
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app

# Copiar archivos del proyecto
COPY pom.xml .
COPY src ./src

# Compilar el proyecto
RUN mvn clean package -DskipTests

# Usar imagen base de JRE para ejecutar
FROM openjdk:17-jdk-slim

# Directorio de trabajo
WORKDIR /app

# Copiar el JAR compilado desde la etapa de construcción
COPY --from=build /app/target/ms-mtls-demo-1.0.0-SNAPSHOT.jar app.jar

# Exponer el puerto HTTPS
EXPOSE 8080
#EXPOSE 443

# Ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]