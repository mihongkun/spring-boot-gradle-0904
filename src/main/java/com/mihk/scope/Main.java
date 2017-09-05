package com.mihk.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeServic p1 = context.getBean(DemoPrototypeServic.class);
        DemoPrototypeServic p2 = context.getBean(DemoPrototypeServic.class);

        System.out.println("s1与s2是否相等:" + s1.equals(s2));
        System.out.println("p1与p2是否相等:" + p1.equals(p2));

    }
}
