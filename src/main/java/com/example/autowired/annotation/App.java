package com.example.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp = (Employee) context.getBean("employee");
        Employee1 emp1 = context.getBean("employee1", Employee1.class);

        System.out.println(emp.toString());
        System.out.println(emp1.toString());

        Manager mgr = context.getBean("manager", Manager.class);
        System.out.println(mgr.toString());


    }
}
