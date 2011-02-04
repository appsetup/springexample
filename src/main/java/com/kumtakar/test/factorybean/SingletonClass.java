package com.kumtakar.test.factorybean;

/**
 * Created by IntelliJ IDEA.
 * User: naveen
 * Date: 4/2/11
 * Time: 7:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class SingletonClass
{
    private static SingletonClass _singletonClassInstance;
    private SingletonClass()
    {

    }

    public static SingletonClass getInstance()
    {
       if(_singletonClassInstance == null)
       {
           _singletonClassInstance = new SingletonClass();
       }
       return _singletonClassInstance;
    }
}
