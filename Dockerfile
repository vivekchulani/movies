FROM adoptopenjdk/openjdk11

#ADD target/movies-1.0-SNAPSHOT.jar movies.jar
COPY . .
ADD target/movies-1.0-SNAPSHOT.jar movies.jar
ENTRYPOINT ["java", "-jar", "movies.jar"]
EXPOSE 8001