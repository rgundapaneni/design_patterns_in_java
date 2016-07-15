/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.bridge;

public class Architect extends Expert {
    @Override
    public void talk() {

        getTranslator().translate("Shall we talk about evolutionary design?");
    }
}
