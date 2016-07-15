/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.adapterclass;

public class MemoryAdapter extends Memory2 implements Memory {

    @Override
    public void store(int addr, byte value) {
        setAddr(addr);
        setValue(value);
    }
}
