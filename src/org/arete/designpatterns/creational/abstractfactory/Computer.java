/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.abstractfactory;

public abstract class Computer {

    private CPU cpu;
    private Memory memory;

    public void addCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void addMemory(Memory memory) {
        this.memory = memory;
    }

    public abstract String getPartsType();

    public String toString() {

        return String.format("%s %s %s", this.getClass().getSimpleName(), cpu, memory);
    }
}
