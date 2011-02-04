package com.kumtakar.test.factorybean;

/**
 * Created by IntelliJ IDEA.
 * User: naveen
 * Date: 4/2/11
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Singletondependent {
    private SingletonClass singletondependent;

    public SingletonClass getSingletondependent() {
        return singletondependent;
    }

    public void setSingletondependent(SingletonClass singletondependent) {
        this.singletondependent = singletondependent;
    }

    public boolean isSingletonset()
    {
        return singletondependent != null;
    }
}
