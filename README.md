spring-boot-start-shell
=======================
Spring Shell with Spring Boot Driven

### How to use

* Add spring-boot-starter-shell dependency in application's pom.xml: 

```xml
    <dependency>
       <groupId>com.mvnsearch.spring.boot</groupId>
       <artifactId>spring-boot-starter-shell</artifactId>
       <version>1.0.0-SNAPSHOT</version>
    </dependency>
```
* Add Spring Boot Maven Plugin in your pom.xml: 

```xml
   <plugin>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-maven-plugin</artifactId>
       <version>1.3.4.RELEASE</version>
       <executions>
           <execution>
               <goals>
                   <goal>repackage</goal>
               </goals>
           </execution>
       </executions>
       <configuration>
           <!-- do not enable it, this will creats a non standard jar and cause autoconfig to fail -->
           <executable>false</executable>
       </configuration>
   </plugin>
```
* Add following code in your Spring Boot Application main method:

```
    @SpringBootApplication
    public class DemoApplication {
    
        public static void main(String[] args) {
            SpringShellApplication.run(DemoApplication.class, args);
        }
    }
```
* Build your application and run it.

```
   $ mvn -DskipTests clean package
   $ java -jar target/xxxx.jar
```

### Tips
* Possible Configuration in your application.properties: 

```properties
spring.main.banner-mode=off
```
* logback-spring.xml configuration to mute some log: 

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>

    <!--stdout appender-->
    <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%d %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>

    <root level="ERROR">
        <appender-ref ref="CONSOLE"/>
    </root>

</configuration>
```

### References

* Spring Shell Document: http://docs.spring.io/spring-shell/docs/current/reference/htmlsingle/
* ASCII Generator: http://www.network-science.de/ascii/
