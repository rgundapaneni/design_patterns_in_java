/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.adapterobject;

public class Memory2 {

    public void setAddr(int addr) {

        System.out.println("Setting address in Memory2");
    }

    public void write(byte value) {

        System.out.println("Wring byte value in Memory2");
    }
}
