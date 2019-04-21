FROM maven:3.5-jdk-8-alpine AS TEMP_BUILD_IMAGE
USER root

ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME

COPY . .

RUN chmod 755 $APP_HOME

RUN mvn install

FROM maven:3.5-jdk-8-alpine
ENV ARTIFACT_NAME=service-0.0.1-SNAPSHOT.jar
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --from=TEMP_BUILD_IMAGE $APP_HOME/target/$ARTIFACT_NAME .
EXPOSE 8080


CMD ["java","-jar", "service-0.0.1-SNAPSHOT.jar"]