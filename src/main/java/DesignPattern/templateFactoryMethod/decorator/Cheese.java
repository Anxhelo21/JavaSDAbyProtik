package DesignPattern.templateFactoryMethod.decorator;

import DesignPattern.templateFactoryMethod.Interface.Pizza;

public class Cheese implements Pizza {
    public Pizza pizza;

    public Cheese(final Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName()+ " Cheese";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 50;
    }
}
