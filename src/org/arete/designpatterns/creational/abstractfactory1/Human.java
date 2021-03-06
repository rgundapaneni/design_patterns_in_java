/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.abstractfactory1;

public class Human extends Animal implements Mammal {

    @Override
    public void makeSound() {
        System.out.println("Human says - Hello, how are you?");
    }
}
