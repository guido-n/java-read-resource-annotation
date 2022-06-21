package com.guido.spring.annotation;

//import org.springframework.context.annotation.ComponentScan; DOESN'T WORK
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@ComponentScan(basePackages = "com.guido.spring.annotation") DOESN'T WORK
@Import(LoadResourceAsStringProcessor.class)
@Documented
public @interface EnableResourceContentAsStringAnnotation {

}
