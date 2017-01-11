package com.guido;

import com.guido.annotation.LoadResourceAsString;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

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

    private static final Logger log = LoggerFactory.getLogger(AnnotationTest.class);

    @LoadResourceAsString("/text/resource.txt")
    private static String staticText;

    @LoadResourceAsString("/text/resource.txt")
    private String text;

    @LoadResourceAsString("/text/non-existent.txt")
    private String badText;

    @Test
    public void annotationTest() {

        assertThat(staticText, equalTo("RESOURCE CONTENT"));
        assertThat(text, equalTo("RESOURCE CONTENT"));
        assertThat(badText, equalTo(""));

    }
}
