<div id="header">

# Lab 1 - Getting Started with Spring Boot

</div>

<div id="content">

<div class="olist arabic">

1.  In your browser, visit [http://start.spring.io](http://start.spring.io).

2.  Fill out the **Project metadata** fields as follows (hint, switch to full version):

    <div class="dlist">

    <dl>

    <dt class="hdlist1">Group</dt>

    <dd>

    `io.spring.pivotal`

    </dd>

    <dt class="hdlist1">Artifact</dt>

    <dd>

    `hello-spring-boot`

    </dd>

    <dt class="hdlist1">Name</dt>

    <dd>

    `hello-spring-boot`

    </dd>

    <dt class="hdlist1">Description</dt>

    <dd>

    `Hello Spring Boot`

    </dd>

    <dt class="hdlist1">Package Name</dt>

    <dd>

    `io.pivotal.spring.hello`

    </dd>

    <dt class="hdlist1">Type</dt>

    <dd>

    Maven Project

    </dd>

    <dt class="hdlist1">Packaging</dt>

    <dd>

    Jar

    </dd>

    <dt class="hdlist1">Java Version</dt>

    <dd>

    1.7

    </dd>

    <dt class="hdlist1">Language</dt>

    <dd>

    Java Spring Boot Version .....

    </dd>

    </dl>

    </div>

3.  In the **Project dependencies** section, check the following:

    <div class="ulist">

    *   Web

    </div>

4.  Click the **Generate Project** button. Your browser will download a zip file. Unpack that zip file at `$COURSE_HOME/lab_01/`.

5.  Import the project’s `pom.xml` into your editor/IDE of choice.

6.  Run the application (as a Spring Boot App) and visit the application in the browser ([http://localhost:8080](http://localhost:8080)), and you should see an error.

7.  Create a new class `io.pivotal.spring.hello.HelloController`.

8.  Add a `@RestController` annotation to the class.

9.  Add the following request handler to the class:

    <div class="listingblock">

    <div class="content">

        @RequestMapping("/")
        public String hello() {
            return "Hello World!";
        }

    </div>

    </div>

10.  Re-start the application and visit the application in the browser ([http://localhost:8080](http://localhost:8080)), and you should see "Hello World".

</div>

<div class="paragraph">

**Congratulations!** You’ve just completed your first Spring Boot application.

</div>

<div class="paragraph">

Spring Boot will embed Apache Tomcat by default - lets try that again using the command line, stop previous running instances of the application.

</div>

*   Build the application:

    <div class="listingblock">

    <div class="content">

    <pre>$ mvn package</pre>

    </div>

    </div>

    *   Run the application:

    <div class="listingblock">

    <div class="content">

    <pre>$ java -jar target/hello-spring-boot-0.0.1-SNAPSHOT.jar</pre>

    </div>

    </div>

    <div class="paragraph">

    You should see the application start up an embedded Apache Tomcat server on port 8080:

    </div>

    <div class="listingblock">

    <div class="content">

    <pre>2015-05-03 13:20:51.690  INFO 2465 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
    2015-05-03 13:20:51.691  INFO 2465 --- [           main] i.p.s.hello.HelloSpringBootApplication   : Started HelloSpringBootApplication in 3.023 seconds (JVM running for 3.432)</pre>

    </div>

    </div>

    *   Visit the application in the browser ([http://localhost:8080](http://localhost:8080)), and you should see the following:

    <div class="listingblock">

    <div class="content">

    <pre>Hello World!</pre>

    </div>

    </div>

## Build and Run with Embedded Eclipse Jetty

<div class="sectionbody">

<div class="paragraph">

Spring Boot also supports embedding a Jetty server.

</div>

<div class="olist arabic">

1.  Open `pom.xml` and replace the following:

    <div class="listingblock">

    <div class="content">

    <pre><dependency>
    	<groupId>org.springframework.boot</groupId>
    	<artifactId>spring-boot-starter-web</artifactId>
    </dependency></pre>

    </div>

    </div>

    <div class="paragraph">

    with:

    </div>

    <div class="listingblock">

    <div class="content">

    <pre><dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <exclusions>
            <exclusion>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-tomcat</artifactId>
            </exclusion>
        </exclusions>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-jetty</artifactId>
    </dependency></pre>

    </div>

    </div>

2.  Build the application:

    <div class="listingblock">

    <div class="content">

    <pre>$ mvn package</pre>

    </div>

    </div>

3.  Run the application:

    <div class="listingblock">

    <div class="content">

    <pre>$ java -jar target/hello-spring-boot-0.0.1-SNAPSHOT.jar</pre>

    </div>

    </div>

    <div class="paragraph">

    You should see the application start up an embedded Jetty server on port 8080:

    </div>

    <div class="listingblock">

    <div class="content">

    <pre>2015-05-03 13:26:31.370  INFO 3078 --- [           main] .s.b.c.e.j.JettyEmbeddedServletContainer : Jetty started on port(s) 8080 (http/1.1)
    2015-05-03 13:26:31.371  INFO 3078 --- [           main] i.p.s.hello.HelloSpringBootApplication   : Started HelloSpringBootApplication in 3.671 seconds (JVM running for 4.079)</pre>

    </div>

    </div>

4.  Visit the application in the browser ([http://localhost:8080](http://localhost:8080)), and you should see the following:

    <div class="listingblock">

    <div class="content">

    <pre>Hello World!</pre>

    </div>

    </div>

5.  Move onto [lab 2](lab_02.html).

</div>

</div>

</div>

<div id="footer">

<div id="footer-text">Last updated 2015-05-04 20:17:44 CDT</div>

</div>
