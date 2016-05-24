# Spring Boot Hello World project
# with Dockerfile and DockerCompose and Nginx



## Spring boot Hello World

#### create executable jar

``` mvn package ```

#### build java app docker image

``` docker build -t sunitparekh/spring-boot-hello . ```

#### run java app container

``` docker run -d -p 8080 --name boothello sunitparekh/spring-boot-hello ```



## Nginx

#### build nginx docker image

``` docker build -t sunitparekh/spring-boot-nginx -f DockerfileNignx .  ```

#### run nginx docker image

``` docker run -d -p 80 --name bootnginx --link boothello:app1 sunitparekh/spring-boot-nginx ```



## hit url using apache benchmark

``` ab -n 30 http://192.168.99.100:32788/ ```
