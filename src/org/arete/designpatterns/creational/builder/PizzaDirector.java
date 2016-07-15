/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.builder;

public class PizzaDirector {

    public void makePizza(PizzaBuilder pizzaBuilder) {

        System.out.println("Creating crust...");
        pizzaBuilder.createCrust();
        System.out.println("Spreading sause...");
        pizzaBuilder.spreadSauce();
        System.out.println("Adding cheese...");
        pizzaBuilder.addCheese();
        System.out.println("Adding toppings...");
        pizzaBuilder.addToppings();
        pizzaBuilder.bake();
    }
}
