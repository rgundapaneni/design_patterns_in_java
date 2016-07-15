/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.adapterobject;

public class Computer {

    private final Memory _memory;

    public Computer(Memory memory) {

        _memory = memory;
    }

    public void doWork() {

        _memory.store(1111, (byte) 1);
    }
}
