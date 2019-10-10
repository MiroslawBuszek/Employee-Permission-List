# Employee Permission List
Project contain a list of employees and their current permissions depending on the position in the factory.

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Contact](#contact)

## General info
The application is a reflection of the existing book of employee permissions in the factory plant.
The application allows you to add a new employee and give him/her the permissions needed to work and also
allows you to edit the data of the existing employee. Thanks to this application, the supervisor in the plant
will know what permissions the workers have.

## Screenshots


## Build with
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Maven](https://maven.apache.org)
* [Thymeleaf](https://www.thymeleaf.org)
* [Bootstrap](https://getbootstrap.com)

## Technologies

* Java - version 8
* H2 database - version 1.4.199

## Running the application locally
There are several ways to run a application your local machine. One way is to run script `build.sh` directly.

- Download the zip to your desktop
- Unzip the zip file
- Run `build.sh` script to build and start project
- Head out to http://localhost:8080/login

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## How to login
Login with user or admin
```
USER (username/password)
user/user

ADMIN (username/password)
admin/admin
 ```
or create your own user with [SignUp](http://localhost:8080/signup)


## Contact

