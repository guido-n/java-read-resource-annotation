package com.guido;

import com.guido.annotation.LoadResourceAsString;

import com.guido.spring.AnnotationBeanExample;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * AnnotationTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/test-context.xml")
public class AnnotationTest {

    @Autowired
    private AnnotationBeanExample annotationBeanExample;

    @LoadResourceAsString("/text/resource.txt")
    private static String STATIC_TEXT;

    @LoadResourceAsString("/text/resource.txt")
    private String text;

    @LoadResourceAsString("/text/non-existent.txt")
    private String badText;

    @Test
    public void annotationTest() {

        assertThat(STATIC_TEXT, equalTo("RESOURCE CONTENT"));
        assertThat(text, equalTo("RESOURCE CONTENT"));
        assertThat(badText, equalTo(""));

    }

    @Test
    public void annotationBeanTest() {

        assertThat(annotationBeanExample.getText(), equalTo("RESOURCE CONTENT"));
        assertThat(annotationBeanExample.getBadText(), equalTo(""));

    }
}
