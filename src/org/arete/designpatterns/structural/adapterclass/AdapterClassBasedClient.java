/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.adapterclass;

public class AdapterClassBasedClient {

    public static void main(String[] args) {

        Computer computer = new Computer(new Memory1());
        computer.work();

        Computer computer1 = new Computer(new MemoryAdapter());
        computer1.work();
    }
}
