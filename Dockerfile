FROM frolvlad/alpine-oraclejdk8:slim
ADD target/hello-world-*RELEASE.jar hello-world.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/hello-world.jar"]