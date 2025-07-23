package com.example.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationComponentScan.xml");

        Employee emp = (Employee) context.getBean("employee");
        Employee1 emp1 = context.getBean("employee1", Employee1.class);

        System.out.println(emp.toString());
        System.out.println(emp1.toString());

    }
}
