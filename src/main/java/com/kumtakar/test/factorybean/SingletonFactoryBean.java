package com.kumtakar.test.factorybean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by IntelliJ IDEA.
 * User: naveen
 * Date: 4/2/11
 * Time: 7:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class SingletonFactoryBean implements FactoryBean{
    public Object getObject() throws Exception {
        return SingletonClass.getInstance();
    }

    public Class<?> getObjectType() {
        return SingletonClass.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
