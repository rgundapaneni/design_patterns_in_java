/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.chainofresponsibility;

public class EvenNumberHandler extends OurDataHandler {

    public EvenNumberHandler(OurDataHandler next) {
        super(next);
    }

    @Override
    public boolean canHandle(int value) {
        return (value % 2 == 0);
    }

    @Override
    public void handleEvent(int value) {

        System.out.println(String.format("%d is even", value));
    }
}
