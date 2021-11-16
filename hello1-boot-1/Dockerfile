FROM openjdk:8
ARG JAR_FILE=target/hello1-boot-1.jar
COPY ${JAR_FILE} hello1-boot-1.jar
EXPOSE 8780
ENTRYPOINT ["java","-jar","/hello1-boot-1.jar"]