module com.guido.spring.annotation.test {

    requires spring.context;
    requires spring.test;
    requires spring.beans;

    requires org.junit.jupiter;
    requires org.hamcrest;

    requires org.apache.logging.log4j;

    requires com.guido.spring.annotation;

    opens com.guido.spring.annotation.test;        // required for JUnit
    opens com.guido.spring.annotation.test.spring; // required for Spring Core

}