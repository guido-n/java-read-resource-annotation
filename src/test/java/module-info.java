module spring.guido.annotation.readresource.test {

    exports com.guido.annotation.test;
    exports com.guido.annotation.test.spring;

    requires spring.context;
    requires spring.test;
    requires spring.beans;

    requires junit;
    requires hamcrest.core;
    requires org.apache.logging.log4j;

    requires spring.guido.annotation.readresource;

    opens com.guido.annotation.test;
    opens com.guido.annotation.test.spring;
}