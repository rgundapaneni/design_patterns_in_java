/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.mediator;

public class Spoke implements WheelComponent {

    private Wheel _wheel;
    private int size;

    public Spoke(Wheel wheel) {

        this._wheel = wheel;
        this._wheel.setWheelComponent(this);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean changeSize(int size) {

        return this._wheel.set(this, size);
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.getClass().getName(), this.size);
    }
}