/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.adapterobject;

public class AdapterObjectClient {

    public static void main(String[] args) {

        Computer computer = new Computer(new Memory1());
        computer.doWork();

        Computer computer1 = new Computer(new Memory2Adapter(new Memory2()));
        computer1.doWork();

        Computer computer2 = new Computer(new Memory2Adapter(new Memory2Derived()));
        computer2.doWork();
    }
}
