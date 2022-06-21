package com.guido.spring.annotation.test.spring;

import com.guido.spring.annotation.ResourceContentAsString;

import org.springframework.stereotype.Component;

@Component
public class AnnotatedComponent {

    @ResourceContentAsString("/com/guido/spring/annotation/test/resource.txt")
    private static String STATIC_TEXT;

    @ResourceContentAsString("/com/guido/spring/annotation/test/resource.txt")
    private String text;

    @ResourceContentAsString("non-existent.txt")
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

