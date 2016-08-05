/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.chainofresponsibility;

import java.util.Optional;

public abstract class OurDataHandler {

    private Optional<OurDataHandler> _next = Optional.empty();

    public OurDataHandler() { }

    public OurDataHandler(OurDataHandler next) {
        _next = Optional.of(next);
    }

    public void handle(int number) {

        if(canHandle(number)) {
            handleEvent(number);
        } else {
            _next.ifPresent( next ->
                    next.handle(number)
            );
        }
    }

    public abstract boolean canHandle(int value);
    public abstract void handleEvent(int value);
}
