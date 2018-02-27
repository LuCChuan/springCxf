FROM maven:3.5.0-jdk-8-alpine

WORKDIR /project
ADD . /project

RUN mvn package -Dmaven.test.skip=true
CMD ["mvn"]


FROM java

COPY /project/target/labs-demo-0.0.1-SNAPSHOT.jar  /usr/src/myapp/labs-demo-0.0.1-SNAPSHOT.jar

WORKDIR /usr/src/myapp/

ENTRYPOINT java -jar labs-demo-0.0.1-SNAPSHOT.jar
