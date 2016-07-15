/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.adapterclass;

public class Computer {

    private final Memory _memory;

    public Computer(Memory memory) {
        _memory = memory;
    }

    public void work() {
        _memory.store(11111, (byte) 0);
    }
}
