/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.observer;

import org.arete.util.ThreadUtil;

import java.util.Observable;

public class Stock extends Observable {

    private void generateStock() {

        while (true) {

            ThreadUtil.sleep(1000);
            double value = Math.random();
            setChanged();
            notifyObservers(value);
        }
    }

    public void start() {

        Thread thread = new Thread(() -> generateStock());
        thread.start();
    }
}
