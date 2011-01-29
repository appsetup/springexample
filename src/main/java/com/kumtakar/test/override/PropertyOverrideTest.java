package com.kumtakar.test.override;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: naveen
 * Date: 29/1/11
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertyOverrideTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        PropertyOverride propertyOverride = classPathXmlApplicationContext.getBean("propertyOverride", PropertyOverride.class);
        PropertyOverride propertyOverride1 = classPathXmlApplicationContext.getBean("propertyOverride1", PropertyOverride.class);
        System.out.println("propertyOverride = " + propertyOverride.getAlgorithmRequired());
        System.out.println("propertyOverride1.getAlgorithmRequired() = " + propertyOverride1.getAlgorithmRequired());

    }
}
