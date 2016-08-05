/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.observer;

import java.util.Observable;

public class SelectStockDisplay {

    private double threshold;

    public SelectStockDisplay(double threshold) {

        this.threshold = threshold;
    }

    public void displayStock(Observable observable, Object data) {

        double value = (double) data;

        if(value > this.threshold) {
            System.out.println(
                    String.format("Stock is above threshold %s - %s", this.threshold, value));
        }
    }
}
