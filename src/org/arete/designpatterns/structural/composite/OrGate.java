/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.composite;

public class OrGate extends Gate {

    @Override
    public void trigger() {
        System.out.println("Trigger like an OR gate");
    }
}
