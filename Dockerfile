FROM openjdk:17
RUN  mkdir -p /test
EXPOSE 8080
WORKDIR /test
COPY src/main/resources/jobportal.jar .
CMD ["java","-jar","jobportal.jar"]


