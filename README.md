# Employee Permission List
Application contain a list of employees and their current permissions depending on the position in the factory.

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


## Technologies
* Java - version 8
* Spring Boot - version 2.1.9
* Maven - version 3.3.9
* Thymeleaf - version 3.0.11
* Bootstrap - version 3.3.6
* H2 database - version 1.4.199

## Running the application locally
There are several ways to run a application your local machine. One way is to run script build.sh directly.

- Download the zip or clone the Git repository.
```sh
git clone https://github.com/MiroslawBuszek/EmployeePermissionList
```
- Unzip the zip file (if you downloaded one)
- Run build.sh script to build and start project
```sh
build.sh
```
- Head out to http://localhost:8080/login

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Contact
