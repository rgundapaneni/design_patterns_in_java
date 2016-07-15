/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.abstractfactory;

public abstract class Memory {

    public String toString() {

        return String.format("%s", this.getClass().getSimpleName());
    }
}
