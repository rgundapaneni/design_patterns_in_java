/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.chainofresponsibility;

public class BelowThresholdHandler extends OurDataHandler {

    private int _threshold;

    public BelowThresholdHandler(int threshold) {

        this._threshold = threshold;
    }

    public BelowThresholdHandler(OurDataHandler next, int threshold) {

        super(next);
        _threshold = threshold;
    }

    @Override
    public boolean canHandle(int value) {
        return value < _threshold;
    }

    @Override
    public void handleEvent(int value) {
        System.out.println(String.format("%d is less than %d", value, _threshold));
    }
}
