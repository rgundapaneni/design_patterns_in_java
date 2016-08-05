/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.chainofresponsibility;

import org.arete.util.ThreadUtil;

import java.util.Random;

public class OurDataSource {

    OurDataHandler _handler;

    public void start() {

        Random random = new Random();
        while (true) {
            ThreadUtil.sleep(1000);
            int number = random.nextInt(1000);

            _handler.handle(number);
        }
    }

    public void addListener(OurDataHandler handler) {

        this._handler = handler;
    }
}
