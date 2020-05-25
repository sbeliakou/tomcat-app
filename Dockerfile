FROM maven:3.6-jdk-8-alpine as builder
WORKDIR /app
COPY pom.xml .
RUN mvn -e -B dependency:resolve
COPY src ./src
RUN mvn -e -B package

FROM tomcat:8.5.0
RUN rm -rf webapps/ROOT
COPY --from=builder /app/target/tomcat-app.war webapps/ROOT.war
