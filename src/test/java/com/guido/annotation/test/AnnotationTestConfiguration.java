package com.guido.annotation.test;

import com.guido.annotation.EnableLoadResourceAsString;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableLoadResourceAsString
@ComponentScan(basePackages = "com.guido.annotation.test.spring")
public class AnnotationTestConfiguration {
}
