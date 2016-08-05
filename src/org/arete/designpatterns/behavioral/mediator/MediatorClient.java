/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.mediator;

public class MediatorClient {

    public static void main(String[] args) {

        Wheel wheel = new WheelImpl();

        Hub hub = new Hub(wheel);
        Tire tire = new Tire(wheel);
        Spoke spoke = new Spoke(wheel);

        tire.changeRadius(100);
        hub.changeRadius(20);
        spoke.changeSize(80);

        System.out.println(tire);
        System.out.println(hub);
        System.out.println(spoke);

        System.out.println(spoke.changeSize(70));

        System.out.println(tire);
        System.out.println(hub);
        System.out.println(spoke);
    }
}
