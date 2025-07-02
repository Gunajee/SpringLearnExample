package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCoupling.xml");


//        UserDataProvider dataProvider = new UserDatabaseProvider();
//        UserManager userManager = new UserManager(dataProvider);

        UserManager userDataProviderManager = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userDataProviderManager.getUserInfo());

//        UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
//        UserManager webUserManager = new UserManager(webServiceDataProvider);

        UserManager webServiceDataProviderUserManager = (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        System.out.println(webServiceDataProviderUserManager.getUserInfo());
    }
}
