/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.state;

public class DriveState extends State {
    public DriveState(Car car) {
        super(car);
    }

    public String getState() {
        return "Drive";
    }

    public void move() {

        getCar().moveForward();
    }

    public void setNextStateUp() {

    }

    public void setNextStateDown() {

        getCar().setState(new NeutralState(car));
    }
}
