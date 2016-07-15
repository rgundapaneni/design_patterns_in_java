/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.builder;

public abstract class PizzaBuilder {

    private Pizza _pizza = new Pizza();

    protected Pizza getPizza() {
        return _pizza;
    }

    public void createCrust() {
        _pizza.createCrust();
    }

    abstract public void spreadSauce();

    abstract public void addCheese();

    abstract public void addToppings();

    abstract public void bake();

    public Pizza create() {
        return _pizza;
    }
}
