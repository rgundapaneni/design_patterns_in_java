/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.abstractfactory1;

public class Cat extends Animal implements Mammal {

    @Override
    public void makeSound() {
        System.out.println("Cat says meow...");
    }
}
