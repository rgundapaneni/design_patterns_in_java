/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Gate> _gates = new ArrayList<>();

    public void add(Gate gate) {

        _gates.add(gate);
    }

    public Gate getGateAt(int index) {

        return _gates.get(index);
    }

    public int getTotalGates() {

        return _gates.size();
    }

    public void triggerBoard() {

        System.out.println("Triggering the board");

        _gates.forEach(Gate::trigger);
    }
}
