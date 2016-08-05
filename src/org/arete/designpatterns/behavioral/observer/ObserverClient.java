/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.observer;

public class ObserverClient {

    public static void main(String[] args) {

        Stock stock = new Stock();

        stock.addObserver((observable, value) ->  System.out.println(value));

        SelectStockDisplay selectStockDisplay = new SelectStockDisplay(0.8);
        stock.addObserver(selectStockDisplay::displayStock);

        LastFiveStockDisplay lastFiveStockDisplay = new LastFiveStockDisplay();
        stock.addObserver(lastFiveStockDisplay);

        stock.start();
    }
}
