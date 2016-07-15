/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.builder;

public class HawaiinPizzaBuilder extends PizzaBuilder {

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
        getPizza().addToppings("Ham", "Pineapple");
    }

    @Override
    public void bake() {
        getPizza().bake();
    }
}
