package com.kumtakar.test.factorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: naveen
 * Date: 4/2/11
 * Time: 7:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class SingletonFactoryBeanTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Singletondependent singletonDependent = classPathXmlApplicationContext.getBean("singletonDependent", Singletondependent.class);
        System.out.println("singletonDependent.isSingletonset() = " + singletonDependent.isSingletonset());
        
        singletonDependent = classPathXmlApplicationContext.getBean("singletonDependent1", Singletondependent.class);
        System.out.println("singletonDependent.isSingletonset() = " + singletonDependent.isSingletonset());

    }
}
