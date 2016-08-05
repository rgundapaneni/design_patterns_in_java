/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.decorator;

public abstract class EvaluatorDecorator implements Evaluator {

    Evaluator _nested;

    EvaluatorDecorator(Evaluator nested) {
        _nested = nested;
    }

    @Override
    public final Candidate evaluate(Candidate candidate) {

        Candidate evaluatedCandidate = candidate;
        if(_nested != null) {
            evaluatedCandidate = _nested.evaluate(candidate);
        }

        return evaluateCandidate(evaluatedCandidate);
    }

    protected abstract Candidate evaluateCandidate(Candidate candidate);
}
