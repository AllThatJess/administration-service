FROM maven as builder

RUN mkdir -pv /home/maven

COPY pom.xml /home/maven

COPY src /home/maven/src

WORKDIR /home/maven

RUN mvn clean package -Dmaven.test.skip=true

FROM openjdk:8-jdk-alpine

COPY --from=builder /home/maven/target/administration-service.jar .

EXPOSE 8060

ENTRYPOINT ["java","-jar","administration-service.jar"]
