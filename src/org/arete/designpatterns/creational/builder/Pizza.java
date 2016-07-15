/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.builder;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Pizza {

    private Crust _crust;
    private Sauce _sauce;
    private String _cheeese;
    private String[] _toppings;

    public void createCrust() {

        _crust = new Crust();
    }

    public void spreadSauce() {
        _sauce = new Sauce();
    }

    public void addCheese() {
        _cheeese = "Mozzarella";
    }

    public void addToppings(String... toppings) {

        _toppings = toppings;
    }

    public void bake() {
        System.out.println("Baking...");
    }

    @Override
    public String toString() {

        String toppings = Stream.of(_toppings).collect(joining(","));

        return "" + _crust + ":" + _sauce + ":" + _cheeese + ":" + toppings;
    }
}
