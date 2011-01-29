package com.kumtakar.test;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by IntelliJ IDEA.
 * User: naveen
 * Date: 25/1/11
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class DisposableInitializing  implements DisposableBean, InitializingBean,BeanNameAware{

    private String beanName;
    public void destroy() throws Exception {
        System.out.println("Destroy called");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization done for bean =>" + beanName);
    }

    public void setBeanName(String s) {
        beanName = s;
    }
}
