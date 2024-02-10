FROM openjdk:17
RUN  mkdir -p /test
EXPOSE 8080
WORKDIR /test
COPY target/jobportal.jar  /test/jobportal.jar
CMD ["java","-jar","jobportal.jar"]


