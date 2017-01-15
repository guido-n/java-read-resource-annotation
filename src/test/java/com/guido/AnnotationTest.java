package com.guido;

import com.guido.spring.AnnotatedBeanExample;

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
    private AnnotatedBeanExample bean;

    @Test
    public void annotationBeanTest() {

        assertThat(bean.getStaticText(), equalTo("RESOURCE CONTENT"));
        assertThat(bean.getText(), equalTo("RESOURCE CONTENT"));
        assertThat(bean.getBadText(), equalTo(""));

    }
}
