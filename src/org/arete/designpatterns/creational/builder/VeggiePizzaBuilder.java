/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.builder;

public class VeggiePizzaBuilder extends PizzaBuilder {

    @Override
    public void createCrust() {
        getPizza().createCrust();
    }

    @Override
    public void spreadSauce() {
        getPizza().spreadSauce();
    }

    @Override
    public void addCheese() {
        getPizza().addCheese();
    }

    @Override
    public void addToppings() {
        getPizza().addToppings("Black olives", "Green olives", "Jalapenos");
    }

    @Override
    public void bake() {
        getPizza().bake();
    }
}
