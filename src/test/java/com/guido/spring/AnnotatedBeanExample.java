package com.guido.spring;

import com.guido.annotation.LoadResourceAsString;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedBeanExample {

    @LoadResourceAsString("/text/resource.txt")
    private static String STATIC_TEXT;

    @LoadResourceAsString("/text/resource.txt")
    private String text;

    @LoadResourceAsString("/text/non-existent.txt")
    private String badText;

    public String getText() {
        return text;
    }

    public String getBadText() {
        return badText;
    }

    public static String getStaticText() {
        return STATIC_TEXT;
    }
}

