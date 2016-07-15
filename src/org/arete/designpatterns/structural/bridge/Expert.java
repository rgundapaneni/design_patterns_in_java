/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.bridge;

public abstract class Expert {

    Translator translator;

    public Translator getTranslator() {
        return translator;
    }

    public void setTranslator(Translator translator) {
        this.translator = translator;
    }

    public abstract void talk();
}
