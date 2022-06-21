package com.guido.spring.annotation;

import java.lang.annotation.*;

/**
 * LoadResourceAsString
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResourceContentAsString {

    String value();

}