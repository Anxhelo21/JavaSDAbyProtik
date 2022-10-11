package DesignPattern.templateFactoryMethod.decorator;

import DesignPattern.templateFactoryMethod.Interface.Pizza;

public class Ham implements Pizza {
    private Pizza pizza;

    public Ham(final Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName()+" Ham";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+120;
    }
}
