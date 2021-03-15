package com.company.factory;

 public class GetCar {
    public Car getCar(String carComplectation){
        if(carComplectation == null){
            return null;
        }
        if(carComplectation.equalsIgnoreCase("Minimum")) {
            return new MinimumComplectation();
        }
        else if(carComplectation.equalsIgnoreCase("Standard")){
            return new StandardComplectation();
        }
        else if(carComplectation.equalsIgnoreCase("Full")) {
            return new FullComplectation();
        }
        return null;
    }
 }
