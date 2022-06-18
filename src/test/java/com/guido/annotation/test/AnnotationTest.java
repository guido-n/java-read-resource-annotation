package com.guido.annotation.test;

import com.guido.annotation.test.spring.AnnotatedBeanExample;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * AnnotationTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AnnotationTestConfiguration.class)
public class AnnotationTest {

    @Autowired
    private AnnotatedBeanExample bean;

    @Test
    public void annotationBeanTest() {

        assertThat(AnnotatedBeanExample.getStaticText(), equalTo("RESOURCE CONTENT"));
        assertThat(bean.getStaticText(), equalTo("RESOURCE CONTENT"));
        assertThat(bean.getText(), equalTo("RESOURCE CONTENT"));
        assertThat(bean.getBadText(), equalTo(""));

    }
}
