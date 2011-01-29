package com.kumtakar.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
        DisposableInitializing disposableInitializing = xmlBeanFactory.getBean("disposableInitializing", DisposableInitializing.class);
        xmlBeanFactory.destroySingletons();
        System.out.println( "Hello World!" );
    }
}
