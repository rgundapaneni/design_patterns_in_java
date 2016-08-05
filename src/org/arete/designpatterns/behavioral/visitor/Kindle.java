/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.visitor;

public class Kindle implements Visitable {

    private String model;

    public Kindle(String model) {

        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

enum KidleModel { Oasis, Fire };
