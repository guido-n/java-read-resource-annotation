package com.guido;

import com.guido.annotation.LoadResourceAsString;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AnnotationTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/test-context.xml")
public class AnnotationTest {

    private static final Logger log = LoggerFactory.getLogger(AnnotationTest.class);

    @LoadResourceAsString("/text/resource.txt")
    private static String queryStatic;

    @LoadResourceAsString("/text/resource.txt")
    private String query;

    @Test
    public void annotationTest() {
        log.info("annotationTest(): queryStatic: \"{}\"", queryStatic);
        log.info("annotationTest(): query: \"{}\"", query);
    }

}
