/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.abstractfactory1;

public class AbstractFactory1Client {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        AbstractSpeciesFactory mammalFactory = GlobalLookupFactory.getSpeciesFactory(Mammal.class);

        Animal cat = mammalFactory.getAnimal("Cat");
        cat.makeSound();

        Animal dog = mammalFactory.getAnimal("Dog");
        dog.makeSound();
        Animal human = mammalFactory.getAnimal("Human");
        human.makeSound();

        AbstractSpeciesFactory reptileFactory = GlobalLookupFactory.getSpeciesFactory(Reptile.class);

        Animal tyrannosaurus = reptileFactory.getAnimal("Tyrannosaurus");
        tyrannosaurus.makeSound();
        Animal snake = reptileFactory.getAnimal("Snake");
        snake.makeSound();
        Animal crocodile = reptileFactory.getAnimal("Crocodile");
        crocodile.makeSound();

    }
}
