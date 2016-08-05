/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.flyweight;

/***
 * FlyWeight Pattern reduces number of object created
 */
public class FlyWeightClient {

    public static void main(String[] args) {

        WorkingWindow window = new WorkingWindow();
        WindowActionManager windowActionManager = new WindowActionManager(window);

        //Flyweight pattern is in operation inside this method
        windowActionManager.bindActions();
    }
}
