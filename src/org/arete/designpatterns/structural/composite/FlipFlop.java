/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FlipFlop extends Gate {

    private List<Gate> _gates = new ArrayList<>();

    public void add(Gate gate) {

        _gates.add(gate);
    }

    public int getComponentCount() {

        return _gates.size();
    }

    @Override
    public void trigger() {

        _gates.forEach(Gate::trigger);
    }
}
