module spring.guido.annotation.readresource {

    exports com.guido.annotation;
    exports com.guido.annotation.spring;

    requires spring.beans;
    requires spring.context;
    requires spring.core;

    requires org.apache.logging.log4j;

}