FROM eclipse-temurin:21-jdk

WORKDIR /app

# Dependências necessárias para Maven Wrapper
RUN apt-get update && apt-get install -y bash curl git

COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline

COPY src ./src

RUN ./mvnw package -DskipTests

CMD ["java", "-jar", "target/api_applimp-0.0.1-SNAPSHOT.jar"]
