/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.prototype;

public class Memory2 implements Memory {
    @Override
    public Memory copyOf() {
        return new Memory2();
    }
}
