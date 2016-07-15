/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.prototype;

public class Memory1 implements Memory {

    @Override
    public Memory copyOf() {
        return new Memory1();
    }
}
