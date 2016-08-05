/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.templatemethod;

public abstract class Develop {

    public void code() {

        writeCode();
        buildCode();
        testCode();
    }

    public abstract void writeCode();
    public abstract void buildCode();
    public abstract void testCode();
}
