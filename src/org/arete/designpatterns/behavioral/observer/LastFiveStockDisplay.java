/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class LastFiveStockDisplay implements Observer {

    private double lastFive = 0;
    private int counter = 0;

    @Override
    public void update(Observable observable, Object data) {

        counter++;
        lastFive += (double) data;
        if(counter % 5 == 0) {

            System.out.println("Last five stock value is: " + lastFive);
        }
    }
}
