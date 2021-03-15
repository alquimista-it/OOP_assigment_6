package com.company;
import com.company.factory.Car;
import com.company.factory.GetCar;

import java.io.*;


public class Main {

    public static void main(String[] args)throws IOException {
        //begin factory
       GetCar Carcomplectation = new GetCar();

        System.out.print("Enter the name of car complectation for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        Car car = Carcomplectation.getCar(planName);
        //call getRate() method and calculateBill()method of Car complectation.

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        car.getRate();
        car.calculateBill(units);
        //end factory
    }
}

