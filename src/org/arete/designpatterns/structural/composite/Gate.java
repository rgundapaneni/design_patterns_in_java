/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.composite;

public abstract class Gate {

    public void add(Gate gate) {

        throw new UnsupportedOperationException();
    }

    public int getComponentCount() {

        return 0;
    }

    public void trigger() {

        System.out.println("Triggering gate " + this.getClass());
    }
}
