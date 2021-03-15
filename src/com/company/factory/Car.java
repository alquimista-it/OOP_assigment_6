package com.company.factory;
import java.io.*;

public abstract class Car {
    protected double rate;
    public abstract void getRate();

    public void calculateBill(int n){
        System.out.println(n*rate);
    }
}

