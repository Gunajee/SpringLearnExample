package com.example.autowired.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    @Autowired
    @Qualifier("employee")
    private Employee emp;
    private Employee1 employee1;

    @Autowired
    public Manager(Employee1 employee1) {
        this.employee1 = employee1;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "emp=" + emp +
                ", emp1=" + employee1 +
                '}';
    }
}
