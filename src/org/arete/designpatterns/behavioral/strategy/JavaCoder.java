/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.strategy;

public class JavaCoder implements Coder {
    @Override
    public void writeCode() {
        System.out.println("Writing code in java");
    }
}
