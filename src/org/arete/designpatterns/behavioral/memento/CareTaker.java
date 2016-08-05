/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> savedStates = new ArrayList<>();

    public void saveState(Memento memento) {

        this.savedStates.add(memento);
    }

    public Memento getSnapshot(int i) {

        return this.savedStates.get(i);
    }

    @Override
    public String toString() {
        return savedStates.toString();
    }
}
