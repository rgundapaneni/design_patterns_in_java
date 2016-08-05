/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.state;

public class NeutralState extends State {

    public NeutralState(Car car) {
        super(car);
    }

    public String getState() {
        return "Neutral";
    }

    public void move() {

        getCar().stayInPlace();
    }

    public void setNextStateUp() {
        getCar().setState(new DriveState(car));
    }

    public void setNextStateDown() {
        getCar().setState(new ReverseState(car));
    }
}