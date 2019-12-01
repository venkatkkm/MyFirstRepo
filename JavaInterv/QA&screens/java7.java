Hi Team,

#Spring #boot #project #interview #questions #Answers
Q.#What are the methods to protect Spring Boot applications?

Use HTTPS in production

Check your dependencies with Snyk

Upgrade to the latest version

Enable CSRF protection

Use content security policies to prevent XSS attacks

Q.#Can Spring Boot be compatible with older Spring projects? How do I do this?

A) Compatible, use @ImportResourceannotations to import old Spring project configuration file.

Q.#How to implement exception handling using Spring Boot?

Ans-Spring provides a very useful way to handle exceptions using ControllerAdvice. We handle all exceptions thrown by the controller class by implementing a ControlerAdvice class.

Q.#What is Swagger? Did you implement it with Spring Boot?

A) Swagger is widely used for visual APIs, using the Swagger UI to provide an online sandbox for front-end developers. Swagger is a tool for generating visual representations of RESTful web services, specifications and full framework implementations.

It enables documents to be updated at the same speed as the server. When properly defined by Swagger, consumers can use a minimal amount of implementation logic to understand and interact with remote services. Therefore, Swagger eliminates the guesswork when calling the service.

Q.#Which is the core annotation of Spring Boot? Which annotations is it mainly composed of?

A) The annotation above the startup class is @SpringBootApplication, which is also a core annotation for Spring Boot. The main combination contains the following three annotations:

@SpringBootConfiguration: Combines the @Configuration annotation to implement the configuration file.

@EnableAutoConfiguration: Turns on automatic configuration. You can also turn off an automatic configuration option, such as turning off data source auto-configuration: @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }).

@ComponentScan: Spring component scan.

 Q.#What are the formats of Spring Boot configuration files? What is the difference between them?

A) .properties and .yml, the main difference between them is the writing format.

1).properties

App.user.name = javastack

2).yml

App: user: name: javastack

In addition, .yml format does not support @PropertySourceannotations import configuration.

Q.#What are the core configuration files for Spring Boot? What is the difference between them?

A) The core configuration files for Spring Boot are the application and bootstrap configuration files.

The application configuration file is easy to understand and is primarily used for automated configuration of Spring Boot projects.

The bootstrap configuration file has the following application scenarios.

Q.#When using Spring Cloud Config to configure the hub, you need to add the configuration properties of the connection to the configuration center in the bootstrap configuration file to load the configuration information of the external configuration center.

Some fixed attributes that cannot be overridden;

Some encryption/decryption scenarios;

Q.#What are the ways in which Spring Boot can read configurations?

A) Spring Boot can bind variables via @PropertySource, @Value, @Environment, @ConfigurationProperties.


Q.#What log framework does Spring Boot support? Which is the recommended and default log framework?

A) Spring Boot supports Java Util Logging, Log4j2, and Lockback as the logging framework. If you use the Starters launcher, Spring Boot will use Logback as the default logging framework.

Q.#What are the ways in which SpringBoot implements hot deployment?

A) There are two main ways:

Spring Loaded

Spring-boot-devtools

Q.#How do you understand the Spring Boot configuration load order?

A) In Spring Boot, there are several ways to load a configuration.

Properties file;

YAML files;

System environment variables;

Command line parameters;

and many more……

Q.#How does Spring Boot define multiple sets of different environment configurations?

A) Provide multiple sets of configuration files, such as:

Applcation.properties application-dev.properties application-test.properties application-prod.properties

Specify a specific configuration file at runtime.

Q.#What are the new features of Spring Boot 2.X? What is the difference with 1.X?

Configuration change

JDK version upgrade

Third-party class library upgrade

Responsive Spring programming support

HTTP/2 support

Configuration property binding

More improvements and enhancements…