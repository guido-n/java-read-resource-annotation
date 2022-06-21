package com.guido.spring.annotation.test;

import com.guido.spring.annotation.test.spring.AnnotatedComponent;
import com.guido.spring.annotation.test.spring.AnnotationTestConfiguration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * AnnotationTest
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AnnotationTestConfiguration.class)
public class AnnotationTest {

    @Autowired
    private AnnotatedComponent component;

    @Test
    public void AnnotatedComponentTest() {

        assertThat(AnnotatedComponent.getStaticText(), equalTo("RESOURCE CONTENT"));
        assertThat(component.getStaticText(),          equalTo("RESOURCE CONTENT"));
        assertThat(component.getText(),                equalTo("RESOURCE CONTENT"));
        assertThat(component.getBadText(),             equalTo(""));

    }
}
