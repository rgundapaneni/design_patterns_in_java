/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.state;

public class StateClient {

    private static void useCar(Car car, boolean direction) {

        System.out.println(car.getState());
        car.move();

        if(direction) {
            car.shiftGearUp();
        } else {
            car.shifGearDown();
        }
    }

    public static void main(String[] args) {

        boolean FORWARD = true;
        boolean BACKWARD = false;

        Car car = new Car();

        for(int i=0; i<4; i++) {
            useCar(car, FORWARD);
        }

        for(int i=0; i<4; i++) {
            useCar(car, BACKWARD);
        }
    }
}
