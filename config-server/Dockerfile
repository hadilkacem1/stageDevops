FROM openjdk:8
VOLUME /tmp
EXPOSE 8066
ADD /target/config-server-0.0.1-SNAPSHOT.jar config-server-0.0.1-SNAPSHOT.jar
# Default active docker profile
#ENV DEFAULT_PROGRAM_ARGS --spring.profiles.active=docker
ENTRYPOINT ["java", "-jar", "config-server-0.0.1-SNAPSHOT.jar"]