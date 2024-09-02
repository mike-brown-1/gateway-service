# gateway-service

Simple [Spring Boot](https://docs.spring.io/spring-boot/index.html) 
REST API for experimenting with 
[Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway).  
This service **DOES NOT** use service discovery.

Check for [compatibility](https://github.com/spring-cloud/spring-cloud-release/wiki/Supported-Versions)
of Spring Boot and Spring Cloud.

## Configuration

The Yaml file includes the version number of the application.  The updateVersion Gradle task 
keeps this value the same as the Gradle project.version.  The compileJava task is set to depend
on the updateVersion task so it does not have be specified as one of the tasks to run.

