FROM openjdk:8
MAINTAINER damon
#指定临时文件目录为/tmp，docker安装目录下会创建一个临时文件并链接到容器的/tmp
VOLUME /tmp
ADD target/docker-boot-0.0.1-SNAPSHOT.jar docker-boot.jar
ENTRYPOINT java -jar /docker-boot.jar
#只声明容器内应该打开的端口并未实际打开，更多是一种规范
#EXPOSE 6001 6002