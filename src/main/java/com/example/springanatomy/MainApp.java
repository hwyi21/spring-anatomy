package com.example.springanatomy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.scan("com.example.springanatomy"); // @Component 스캔용
        context.refresh();

        MyService myService = context.getBean(MyService.class);
        myService.doSomething();

        context.close();
    }
}
