/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.decorator;

public class CrimeEvaluator extends EvaluatorDecorator {

    CrimeEvaluator(Evaluator next) {
        super(next);
    }

    @Override
    public Candidate evaluateCandidate(Candidate candidate) {

        boolean qualified = true;
        if(Math.random() < 0.55) {
            qualified = false;
        }

        return new Candidate(candidate.get_firstName(), candidate.get_lastName(),
                qualified && candidate.is_qualified(), candidate.get_evaluations() +
                "\nCrime Evaluator: " + qualified);
    }
}
