/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.builder;

public class BuilderClient {

    public static void main(String[] args) {

        PizzaDirector pizzaDirector = new PizzaDirector();

        PizzaBuilder cheesePizzaBuilder = new CheesePizzaBuilder();
        pizzaDirector.makePizza(cheesePizzaBuilder);

        System.out.println(cheesePizzaBuilder.create());

        PizzaBuilder veggiePizzaBuilder = new VeggiePizzaBuilder();
        pizzaDirector.makePizza(veggiePizzaBuilder);

        System.out.println(veggiePizzaBuilder.create());

        PizzaBuilder hawaiinPizzaBuilder = new HawaiinPizzaBuilder();
        pizzaDirector.makePizza(hawaiinPizzaBuilder);

        System.out.println(hawaiinPizzaBuilder.create());
    }
}
