package com.company.singlton;

public final class Singleton {
    private static Singleton instance;//Singleton variable
    public String value;//value variable

    private Singleton(String value) {//private Singleton method with value value

        try {
            Thread.sleep(1000);// This code make skow starting.
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {//getter for singleton
        if (instance == null) {//if variable is null
            instance = new Singleton(value);//giving the new value for variable
        }
        return instance;//returning the variable
    }
}