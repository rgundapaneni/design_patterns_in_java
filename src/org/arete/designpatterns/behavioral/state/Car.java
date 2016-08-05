/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.state;

public class Car {

    private State _currentState;

    public Car() {

        setState(new ParkedState(this));
    }

    public void setState(State state) {

        this._currentState = state;
    }

    public String getState() {

        return this._currentState.getState();
    }

    public void stayPut() {

        System.out.println("Car is in parked, staying put...");
    }

    public void moveBackward() {

        System.out.println("Car is moving in reverse direction");
    }

    public void stayInPlace() {

        System.out.println("Car is staying in place");
    }

    public void moveForward() {

        System.out.println("Car is moving in forward direction");
    }

    public void move() {

        this._currentState.move();
    }

    public void shiftGearUp() {

        this._currentState.setNextStateUp();
    }

    public void shifGearDown() {

        this._currentState.setNextStateDown();
    }
}
