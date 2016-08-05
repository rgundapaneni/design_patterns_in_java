/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.interpreter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class InterpreterClient {

    public static void main(String[] args) {

        Set<String> operators = new HashSet<>(Arrays.asList("*", "+", "-", "/"));

        String mathExpr = "3 4 1 - 5 * +";

        Expression expression = parseMathExpression(operators, mathExpr);

        int evaluatedValue = expression.evaluate();

        System.out.println("Evaludated value of math expression is: " + evaluatedValue);
    }

    private static Expression parseMathExpression(Set<String> operators, String mathExpr) {

        String[] parts = mathExpr.split("\\s");

        Stack<Expression> operands = new Stack<>();
        for(int i=0; i<parts.length; i++) {

            if(operators.contains(parts[i].trim())) {

                Expression rightOperand = operands.pop();
                Expression leftOperand = operands.pop();

                Operator op = Operator.getOperatorFromSymbol(parts[i].trim());

                Expression operation = new Operation(leftOperand, op, rightOperand);
                operands.push(operation);

            } else {
                operands.push(new Operand(Integer.valueOf(parts[i].trim())));
            }
        }

        return operands.pop();
    }
}