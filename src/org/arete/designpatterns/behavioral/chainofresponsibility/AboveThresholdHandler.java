/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.chainofresponsibility;

public class AboveThresholdHandler extends OurDataHandler {

    private int _threshold;

    public AboveThresholdHandler(int threshold) {

        this._threshold = threshold;
    }

    public AboveThresholdHandler(OurDataHandler next, int threshold) {

        super(next);
        this._threshold = threshold;
    }

    @Override
    public boolean canHandle(int value) {

        return (value > _threshold);
    }

    @Override
    public void handleEvent(int value) {

        System.out.println(String.format("%d is greater than %d", value, _threshold));
    }
}
