package com.guido.spring;

import com.guido.annotation.LoadResourceAsString;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * LoadResourceAsStringProcessor
 */
@Component
public class LoadResourceAsStringProcessor implements BeanPostProcessor {

    private static final Logger log = LoggerFactory.getLogger(LoadResourceAsStringProcessor.class);

    /**
     * Load a resource as a String
     *
     * @param resourcePath
     * @param clazz class used to access the resource
     *
     * @return
     */
    private static String loadResourceAsString(String resourcePath, Class<?> clazz) {
        String resourceContent = "";
        try {
            resourceContent = new String(
                    Files.readAllBytes( Paths.get(clazz.getResource(resourcePath).toURI()) ),
                    StandardCharsets.UTF_8
            );
        } catch (Exception e) {
            log.error("loadStringFromResource(): couldn't load resource \"{}\"", resourcePath);

            // we could throw an unchecked exception here and make the loading to break when a resource is not found
            // throw new RuntimeException(String.format("Couldn't load resource: %s", resourcePath), e);

        }
        return resourceContent;
    }

    /**
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    /**
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        ReflectionUtils.doWithFields(
                bean.getClass(),
                (field) -> {
                    LoadResourceAsString annotation = field.getAnnotation(LoadResourceAsString.class);
                    if (annotation != null) {

                        log.debug(
                                "postProcessAfterInitialization(): ({}) {}: load from \"{}\"",
                                field.getClass().getCanonicalName(),
                                field.getName(),
                                annotation.value()
                        );

                        field.setAccessible(true);
                        field.set( bean, loadResourceAsString(annotation.value(), field.getClass()) );
                        field.setAccessible(false);
                    }
                }
        );

        return bean;
    }

}
