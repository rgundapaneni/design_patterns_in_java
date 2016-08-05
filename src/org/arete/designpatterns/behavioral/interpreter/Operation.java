/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.interpreter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

enum Operator {

    Plus("+"), Minus("-"), Multiply("*"), Divide("/"), None("?");

    private String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Operator getOperatorFromSymbol(String symbolValue) {

        Operator operator = Operator.None;
        for(Operator op : Operator.values()) {
            if(op.symbol.equalsIgnoreCase(symbolValue)) {
                operator = op;
                break;
            }
        }

        return operator;
    }
}

public class Operation implements Expression {

    private Expression leftOperand;
    private Operator operator;
    private Expression rightOperand;

    public Operation(Expression leftOperand, Operator operator, Expression rightOperand) {

        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    @Override
    public int evaluate() {

        int e1valudatedValue = -1;

        int leftValue = leftOperand.evaluate();
        String op = operator.getSymbol();
        int rightValue = rightOperand.evaluate();

        ScriptEngine scriptEngine = (new ScriptEngineManager()).getEngineByExtension("js");
        try {
            String expr = String.format("%d %s %d", leftValue, op, rightValue);
            e1valudatedValue = ((Integer) scriptEngine.eval(expr)).intValue();

        } catch (ScriptException e) {
            e.printStackTrace();
        }

        return e1valudatedValue;
    }
}