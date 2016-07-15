/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.adapterobject;

public class Memory1 implements Memory {

    @Override
    public void store(int addr, byte value) {
        System.out.println("Storing addr, value in Memory1");
    }
}
