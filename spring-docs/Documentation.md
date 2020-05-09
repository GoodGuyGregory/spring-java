[Maven Spring Project Documentation](https://spring.io/guides/gs/maven/)

**Running Programs**

requires a compile and packaging of the java code

`mvn compile`

This will run Maven, telling it to execute the compile goal. When it’s finished, you should find the compiled .class files in the target/classes directory.

`mvn package`

The package goal will compile your Java code, run any tests, and finish by packaging the code up in a JAR file within the target directory. 

The name of the JAR file will be based on the project’s <artifactId> and <version>. For example, given the minimal pom.xml file from before, the JAR file will be named `gs-maven-0.1.0.jar.`

To execute the JAR file run:

`java -jar target/gs-maven-0.1.0.jar`
