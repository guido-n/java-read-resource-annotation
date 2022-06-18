package com.guido.annotation.test.spring;

import com.guido.annotation.ResourceContentAsString;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedBeanExample {

    @ResourceContentAsString("/com/guido/annotation/test/resource.txt")
    private static String STATIC_TEXT;

    @ResourceContentAsString("/com/guido/annotation/test/resource.txt")
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

