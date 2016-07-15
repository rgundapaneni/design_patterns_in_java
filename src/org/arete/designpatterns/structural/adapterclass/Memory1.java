/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.adapterclass;

public class Memory1 implements Memory {

    @Override
    public void store(int addr, byte value) {
        System.out.println("Storing in Memory1...");
    }
}
