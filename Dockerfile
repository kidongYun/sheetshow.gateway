FROM lpicanco/java11-alpine
VOLUME /tmp
EXPOSE 8000
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=local"]