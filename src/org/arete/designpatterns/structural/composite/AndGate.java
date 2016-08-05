/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.composite;

public class AndGate extends Gate {

    @Override
    public void trigger() {
        System.out.println("Trigger liken an AND gate");
    }
}
