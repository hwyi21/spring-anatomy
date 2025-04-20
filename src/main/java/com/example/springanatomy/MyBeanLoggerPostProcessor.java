package com.example.springanatomy;


import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanLoggerPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("[BEFORE INIT] " + beanName + " (" + bean.getClass().getSimpleName() + ")");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("[AFTER INIT] " + beanName + " (" + bean.getClass().getSimpleName() + ")");
        return bean;
    }
}
