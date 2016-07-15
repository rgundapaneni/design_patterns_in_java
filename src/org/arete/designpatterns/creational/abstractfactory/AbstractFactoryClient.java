/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.abstractfactory;

public class AbstractFactoryClient {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        ComputerA computerA = new ComputerA();
        createComputer(computerA);

        System.out.println(computerA);

        ComputerB computerB = new ComputerB();
        createComputer(computerB);

        System.out.println(computerB);
    }

    public static void createComputer(Computer computer) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        String partsType = computer.getPartsType();

        computer.addCPU( (CPU)
                Class.forName("org.arete.designpatterns.creational.abstractfactory.CPU" + partsType).newInstance());
        computer.addMemory( (Memory)
                Class.forName("org.arete.designpatterns.creational.abstractfactory.Memory" + partsType).newInstance());
    }
}
