/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.decorator;

public class CommunityEvaluator extends EvaluatorDecorator {

    public CommunityEvaluator(EvaluatorDecorator experienceEvaluator) {
        super(experienceEvaluator);
    }

    @Override
    protected Candidate evaluateCandidate(Candidate candidate) {

        boolean qualified = true;
        if(Math.random() < 0.45) {
            qualified = false;
        }

        return new Candidate(candidate.get_firstName(), candidate.get_lastName(),
                candidate.is_qualified() && qualified, candidate.get_evaluations() +
                    "\nCommunity Evaluation: " + qualified);
    }
}
