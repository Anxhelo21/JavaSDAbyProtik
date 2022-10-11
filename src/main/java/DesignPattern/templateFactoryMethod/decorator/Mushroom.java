package DesignPattern.templateFactoryMethod.decorator;

import DesignPattern.templateFactoryMethod.Interface.Pizza;

public class Mushroom implements Pizza {

    private Pizza pizza;

    public Mushroom(final Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName()+ " Mushroom";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+ 80;
    }
}
