# Stage 1: Build the application
FROM maven:3.6.3-jdk-8 as builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package

# Stage 2: Create a runtime image
FROM tomcat:9.0.8-jre8-alpine
COPY --from=builder /app/target/*.war /usr/local/tomcat/webapps/activetoronto.war
RUN ls
WORKDIR /user/local/tomcat/
EXPOSE 8080
ENTRYPOINT ["catalina.sh", "run"] 
