# 项目说明
(注意，该项目只是一个demo，仅供学习，要启动这个项目，请只打开这个kf-lucky的demo，不要全部打开)
####(注意,kf-lucky用的插件是mybatis-plus,fdemo用的是mybatis，以下内容为kf-lucky的项目介绍，fdemo的介绍具体看代码，该demo仅供学习)
## src.main.java.kf.lucky.main
1. common
~~~ java
//该文件下放的demo的 跨域文件，以及统一返回格式的文件
~~~
2. controller
~~~ java
//这是demo的控制层，最后的api由这里放出
/**
Controller层:
Controller层负责具体的业务模块流程的控制,就是我们进行编程时候以Api为后缀结尾的类，
在此层里面要调用Serice层的接口来控制业务流程，因为service层里封装了业务处理的方法。
控制器主要就是来调用这些service来实现业务。针对具体的业务流程，会有不同的控制器，我们
具体的设计过程中可以将流程进行抽象归纳，设计出可以重复利用的子单元流程模块，这样不仅使
程序结构变得清晰，也大大减少了代码量
**/

~~~
3. mapper
~~~ java
//这是demo的注解层
//具体可以看这个https://blog.csdn.net/u012060033/article/details/128040322
//这个常用 @Mapper，不写的话项目找不到，会报错
~~~
4. model
~~~ java
//这是demo的实体模型，对应数据库的表结构
~~~
5. service
~~~ java
//这是demo的服务层
/**
Service层：
Service层主要负责业务模块的逻辑。一般service层我们会先写一个interface，
这个接口以service为后缀表示这是一个service接口，在这个类里定义好我们需要的方法，
然后写实现类去实现这个接口里的方法，这样可以做到高度解耦合，非常nice的编程习惯。
service层编写完成后，我们就可以在controller层中调用Service接口来进行业务处理。
Service层的业务实现，具体要调用到已定义的DAO层的接口，封装Service层的业务逻辑有
利于通用的业务逻辑的独立性和重复利用性，程序显得非常简洁。
**/
~~~
1. Main
~~~ java
//这是demo的加载文件
~~~
## resources
1. mapper
~~~~ xml
用来定义sql语句，与数据库关联
<!--头部必须有这个-->
<!DOCTYPE mapper   PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
~~~~
2. static
~~~ txt
前端页面文件，可以用来写前后端半分离，或者前后端不分离项目
~~~
3. application.yml
~~~ yml\
# 端口定义
server:
  port: 8011
  servlet:
    context-path: /
# 数据库配置
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: root
    password: root
~~~
### pom
~~~ xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>kf-lucky</groupId>
    <artifactId>kf-lucky</artifactId>
    <version>1.0-SNAPSHOT</version>

    <description>
        web服务入口
    </description>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.4.13</version>
        <relativePath/>
    </parent>

<!--    声明版本，统一规定，方便查找-->
    <properties>
        <mysql-version>8.0.23</mysql-version>
        <druid.version>1.1.22</druid.version>
        <mybatis-plus-version>3.2.0</mybatis-plus-version>
    </properties>

    <dependencies>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jdbc</artifactId>
        </dependency>
<!--    mysql-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>${mysql-version}</version>
        </dependency>

        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid-spring-boot-starter</artifactId>
            <version>${druid.version}</version>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
<!-- mybatis-plus 插件-->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>${mybatis-plus-version}</version>
        </dependency>
<!--        验证-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
            <version>2.3.3.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>

    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
~~~
