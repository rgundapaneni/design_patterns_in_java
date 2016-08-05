/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.mediator;

public interface Wheel {

    public void setWheelComponent(WheelComponent wheelComponent);

    public boolean set(WheelComponent wheelComponent, int radius);
}
