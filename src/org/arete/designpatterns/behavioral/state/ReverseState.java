/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.state;

public class ReverseState extends State {

    public ReverseState(Car car) {
        super(car);
    }

    public String getState() {

        return "Reverse";
    }

    public void move() {

        getCar().moveBackward();
    }

    public void setNextStateUp() {

        getCar().setState(new NeutralState(car));
    }

    public void setNextStateDown() {

        getCar().setState(new ParkedState(car));
    }
}
