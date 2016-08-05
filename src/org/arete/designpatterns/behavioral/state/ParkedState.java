/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.state;

public class ParkedState extends State {

    public ParkedState(Car car) {
        super(car);
    }

    public String getState() {
        return "Parked";
    }

    public void move() {

        getCar().stayPut();
    }

    public void setNextStateUp() {

        getCar().setState(new ReverseState(car));
    }

    public void setNextStateDown() {

    }
}