package com.mihk.aop;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DomeMethodService  domeMethodService = context.getBean(DomeMethodService.class);

        demoAnnotationService.add();

        domeMethodService.add();

        context.close();


    }

}
