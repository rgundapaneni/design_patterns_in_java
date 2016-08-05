/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.interpreter;

public class Operand implements Expression {

    private Number number;

    public Operand(Number number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        return this.number.intValue();
    }
}
