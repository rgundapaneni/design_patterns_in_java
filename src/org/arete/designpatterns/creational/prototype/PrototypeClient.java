/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.prototype;

public class PrototypeClient {

    private static Computer makeCopy(Computer computer) {

        return computer.copyOf();
    }

    public static void main(String[] args) {

        Computer computer1 = new Computer(new Memory1());
        Computer computer2 = new Computer(new Memory2());
        Computer computer3 = new Computer(new Memory3());

        System.out.println(makeCopy(computer1));
        System.out.println(makeCopy(computer2));
        System.out.println(makeCopy(computer3));
    }
}
