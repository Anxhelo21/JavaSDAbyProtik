package DesignPattern.templateFactoryMethod.entities;

import DesignPattern.templateFactoryMethod.Interface.Pizza;

public class Margarita implements Pizza {


    @Override
    public String getName() {
        return "Margarita";
    }

    @Override
    public double getPrice() {
        return 450;
    }
}
