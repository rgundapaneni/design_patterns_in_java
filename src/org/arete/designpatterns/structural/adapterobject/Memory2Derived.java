/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.adapterobject;

public class Memory2Derived extends Memory2 {

    @Override
    public void write(byte value) {

        System.out.println("Writing byte value in derived memory2 class");
    }
}
