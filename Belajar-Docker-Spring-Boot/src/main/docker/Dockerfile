FROM java:8
ADD belajar.docker.spring.boot.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Dspring.profiles.active=container","-jar","/app.jar"]
