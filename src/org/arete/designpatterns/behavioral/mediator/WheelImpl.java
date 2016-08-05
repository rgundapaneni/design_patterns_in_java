/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.mediator;

public class WheelImpl implements Wheel {

    Tire _tire;
    Hub _hub;
    Spoke _spoke;

    @Override
    public void setWheelComponent(WheelComponent wheelComponent) {

        if(wheelComponent instanceof Tire) {
            this._tire = (Tire) wheelComponent;
        } else if(wheelComponent instanceof Hub) {
            this._hub = (Hub) wheelComponent;
        } else if(wheelComponent instanceof Spoke) {
            this._spoke = (Spoke) wheelComponent;
        }
    }

    @Override
    public boolean set(WheelComponent wheelComponent, int size) {

        if(wheelComponent instanceof Tire) {
            return setRadius( (Tire) wheelComponent, size);
        } else if(wheelComponent instanceof Hub) {
            return setRadius( (Hub) wheelComponent, size);
        } else if(wheelComponent instanceof Spoke) {
            return setSize( (Spoke) wheelComponent, size);
        }

        return false;
    }

    private boolean setRadius(Tire tire, int radius) {

        if(_hub == null || _hub.getRadius() < radius) {
            tire.setRadius(radius);
            if(_hub != null) {
                _spoke.setSize(tire.getRadius() - _hub.getRadius());
            }

            return true;
        }

        return false;
    }

    private boolean setRadius(Hub hub, int radius) {

        if(_tire == null || _tire.getRadius() > radius) {
            hub.setRadius(radius);
            if(_tire != null) {
                _spoke.setSize(_tire.getRadius() - hub.getRadius());
            }

            return true;
        }

        return false;
    }

    private boolean setSize(Spoke spoke, int size) {

        if(_tire == null || _hub == null || _tire.getRadius() - _hub.getRadius() == size) {

            spoke.setSize(size);
            return true;
        }

        return false;
    }
}
