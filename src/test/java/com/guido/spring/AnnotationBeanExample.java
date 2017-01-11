package com.guido.spring;

import com.guido.annotation.LoadResourceAsString;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by guido on 11/01/17.
 */
@Component
public class AnnotationBeanExample {

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
}
