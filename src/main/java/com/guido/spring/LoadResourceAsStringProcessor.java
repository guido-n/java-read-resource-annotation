package com.guido.spring;

import com.guido.annotation.LoadResourceAsString;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

/**
 * LoadResourceAsStringProcessor
 */
public class LoadResourceAsStringProcessor implements BeanPostProcessor {

    private static final Logger log = LoggerFactory.getLogger(LoadResourceAsStringProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        ReflectionUtils.doWithFields(
                bean.getClass(),
                (field) -> {
                    if (field.getAnnotation(LoadResourceAsString.class) != null) {
                        log.info("postProcessAfterInitialization(): {}", field.getName());
                    }
                }
        );

        return bean;
    }

}
