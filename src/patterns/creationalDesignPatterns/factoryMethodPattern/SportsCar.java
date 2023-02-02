package patterns.creationalDesignPatterns.factoryMethodPattern;

import patterns.creationalDesignPatterns.factoryMethodPattern.Car;

public class SportsCar implements Car {


    @Override
    public void drive() {
        System.out.println("Driving a sports car!");
    }
}
