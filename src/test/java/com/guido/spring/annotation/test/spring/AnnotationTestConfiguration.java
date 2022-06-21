package com.guido.spring.annotation.test.spring;

import com.guido.spring.annotation.EnableResourceContentAsStringAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableResourceContentAsStringAnnotation
@ComponentScan(basePackages = "com.guido.spring.annotation.test.spring")
public class AnnotationTestConfiguration {

}
