FROM adoptopenjdk/openjdk11

#ADD target/movies-1.0-SNAPSHOT.jar movies.jar
WORKDIR /
COPY ./target/movies-1.0-SNAPSHOT.jar movies.jar
USER root
RUN chmod 777 movies.jar
ENTRYPOINT ["java", "-jar", "movies.jar"]
EXPOSE 8001