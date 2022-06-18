package com.guido.annotation.test;

import com.guido.annotation.EnableResourceContentAsStringAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableResourceContentAsStringAnnotation
@ComponentScan(basePackages = "com.guido.annotation.test.spring")
public class AnnotationTestConfiguration {
}
