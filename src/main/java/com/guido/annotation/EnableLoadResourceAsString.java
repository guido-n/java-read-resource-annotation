package com.guido.annotation;

//import org.springframework.context.annotation.ComponentScan; DOESN'T WORK
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@ComponentScan(basePackages = "com.guido.annotation.spring") DOESN'T WORK
@Import(com.guido.annotation.spring.LoadResourceAsStringProcessor.class)
@Documented
public @interface EnableLoadResourceAsString {

}
