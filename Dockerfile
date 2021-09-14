FROM adoptopenjdk/openjdk11

#ADD target/movies-1.0-SNAPSHOT.jar movies.jar
WORKDIR /project
COPY ./target/movies-1.0-SNAPSHOT.jar movies.jar
ENTRYPOINT ["java", "-jar", "movies.jar"]
EXPOSE 8001