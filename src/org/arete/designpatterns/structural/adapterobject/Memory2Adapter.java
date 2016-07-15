/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.adapterobject;

public class Memory2Adapter implements Memory {

    private Memory2 _memory2;

    public Memory2Adapter(Memory2 memory2) {

        _memory2 = memory2;
    }

    @Override
    public void store(int addr, byte value) {

        _memory2.setAddr(addr);
        _memory2.write(value);
    }
}
