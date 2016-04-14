### Run following commands to build image

#### create executable jar

mvn package

#### build docker image

docker build -t sunitparekh/java8slim-hello .

#### start container 

docker run -d -p 8080 sunitparekh/java8slim-hello