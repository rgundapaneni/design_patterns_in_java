/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.memento;

public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveToMemento() {

        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {

        this.state = memento.getState();
    }

    @Override
    public String toString() {
        return String.format("State: %s", this.state);
    }
}
