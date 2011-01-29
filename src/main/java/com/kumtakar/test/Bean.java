package com.kumtakar.test;

import java.beans.PropertyChangeListener;

/**
 * Created by IntelliJ IDEA.
 * User: naveen
 * Date: 26/1/11
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Bean implements java.io.Serializable{

      String sampleProperty;

    abstract public void addPropertyChangeListener(PropertyChangeListener listener);

    abstract public void removePropertyChangeListener(PropertyChangeListener listener);

     public String getSampleProperty(){
        return sampleProperty;
     }

     public void setSampleProperty(String value){
        this.sampleProperty = value;
     }

     public String toString(){
       return "sampleProperty is " + sampleProperty;
     }

  }
