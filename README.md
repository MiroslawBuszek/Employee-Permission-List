# Employee Permission List
Project contain a list of employees and their current permissions depending on the position in the factory.

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Demo project](#sdemoproject)
* [Build with](#build-with)
* [Technologies](#technologies)
* [Running the application locally](#running-the-application-locally)
* [How to login](#how-to-login)
* [Contact](#contact)

## General info
The application is a reflection of the existing book of employee permissions in the factory plant.
The application allows you to add a new employee and give him/her the permissions needed to work and also
allows you to edit the data of the existing employee. Thanks to this application, the supervisor in the plant
will know what permissions the workers have.

## Screenshots
* Admin
![admin](https://p41.f3.n0.cdn.getcloudapp.com/items/wbuekX65/admin.JPG?v=ca62cd2d238d7287a2f8e16d82d637c7)

* User
![user](https://p41.f3.n0.cdn.getcloudapp.com/items/KouQejJz/user.JPG?v=54f7378c94d1188b2b9c6b0de7844b83)

## Demo project
* Admin
![admingif](https://p41.f3.n0.cdn.getcloudapp.com/items/KouQeAgd/admingif.gif?v=fd97fa95a054df9e806c9e6cf8c0afb0)

* User
![usergif](https://p41.f3.n0.cdn.getcloudapp.com/items/E0uPEy54/usergif.gif?v=d352a7ee6ec92d6beb0a81762bf82736)

## Build with
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Maven](https://maven.apache.org)
* [Thymeleaf](https://www.thymeleaf.org)
* [Bootstrap](https://getbootstrap.com)

## Technologies
* Java - version 8
* H2 embedded database

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
[Linkedin](https://www.linkedin.com/in/miros%C5%82aw-buszek-26440a167/)
