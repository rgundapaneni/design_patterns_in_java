/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.bridge;

public class Programmer extends Expert {

    @Override
    public void talk() {

        getTranslator().translate("I would like to talk about multithreading");
    }
}
