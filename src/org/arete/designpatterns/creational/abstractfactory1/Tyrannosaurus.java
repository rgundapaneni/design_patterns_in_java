/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.abstractfactory1;

public class Tyrannosaurus extends Animal implements Reptile {

    @Override
    public void makeSound() {
        System.out.println("Tyrannosaurus says Roar...");
    }
}
