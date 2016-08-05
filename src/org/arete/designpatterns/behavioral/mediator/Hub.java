/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.mediator;

public class Hub implements WheelComponent {

    private Wheel _wheel;
    private int radius;

    public Hub(Wheel wheel) {

        this._wheel = wheel;
        this._wheel.setWheelComponent(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean changeRadius(int radius) {

        return this._wheel.set(this, radius);
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.getClass().getName(), this.radius);
    }
}
