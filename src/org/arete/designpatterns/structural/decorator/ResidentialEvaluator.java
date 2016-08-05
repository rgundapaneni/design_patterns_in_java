/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.decorator;

public class ResidentialEvaluator implements Evaluator {

    public Candidate evaluate(Candidate candidate) {

        boolean qualified = true;
        if(Math.random() > 0.5) {
            qualified = false;
        }

        return new Candidate(candidate.get_firstName(), candidate.get_lastName(),
                candidate.is_qualified() && qualified,
                candidate.get_evaluations() + "\nResidential Evaluatation: " + qualified);
    }
}
