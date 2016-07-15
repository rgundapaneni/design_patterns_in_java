/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.prototype;

public class Computer {

    private final Memory _memory;

    public Computer(Memory memory) {

        _memory = memory;
    }

    public Computer copyOf() {

        return new Computer(_memory.copyOf());
    }

    @Override
    public String toString() {
        return "Computer{" + "_memory=" + _memory + "'(" + _memory.hashCode() + ")}'";
    }
}
