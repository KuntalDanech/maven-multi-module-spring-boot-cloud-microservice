# maven-multi-module-spring-boot-cloud-microservice
- This is a demo applciation
- Maven multi module project has been created for flexibility, parent project has all dependecies so that no need to import dependecies in a seprate maven module
- Spring boot and cloud projects have been utilised
- Spring Netflix Eureka server has been created and registred all other services to it
- Spring Netflix Zuul Proxy server has been utilised to provide routing
- We can create as many Maven module project as we need in our project
- We can add front end project as a separate maven module underneath parent maven project so that front end static content can be deployed in Embedded tomcat server
