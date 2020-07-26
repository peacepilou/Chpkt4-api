# SlamCoffee

I had 2 days to create a fullstack project. For the backend, I used Java (Spring/JPA/Hibernate) in order to create a RestApi. For the frontend, I used Angular.
This frontend is currently online and hosted by Fiebase : https://checkpoint4-5a164.web.app/

This backend is still not deployed. In order to enjoy the full project, you shloud know how spring/jpa/hibernate works...

Please, clone this repo and : 

Step 1 : create a database with the name "trainingChkpt4" <br>
Step 2 : be careful to the application.properties : maybe you should point your localhost on a different port than 3306 (depending on how you've created your mysql local instance) <br>
Step 3 : run the command "mvn-spring-boot:run"

Hope it will work for you ! :)

[![Build Status](https://travis-ci.org/codecentric/springboot-sample-app.svg?branch=master)](https://travis-ci.org/codecentric/springboot-sample-app)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/springboot-sample-app/badge.svg?branch=master)](https://coveralls.io/github/codecentric/springboot-sample-app?branch=master)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
