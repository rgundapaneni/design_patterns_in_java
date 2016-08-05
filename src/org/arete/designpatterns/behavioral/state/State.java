/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.state;

public abstract class State {

    protected Car car;

    public State(Car car) {

        this.car = car;
    }

    public Car getCar() {
        return this.car;
    }

    public abstract String getState();

    public abstract void move();

    public abstract void setNextStateUp();

    public abstract void setNextStateDown();
}
