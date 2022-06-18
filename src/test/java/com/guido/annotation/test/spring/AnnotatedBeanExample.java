package com.guido.annotation.test.spring;

import com.guido.annotation.LoadResourceAsString;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedBeanExample {

    @LoadResourceAsString("/com/guido/annotation/test/resource.txt")
    private static String STATIC_TEXT;

    @LoadResourceAsString("/com/guido/annotation/test/resource.txt")
    private String text;

    @LoadResourceAsString("non-existent.txt")
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

