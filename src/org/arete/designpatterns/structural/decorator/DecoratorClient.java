/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.decorator;

public class DecoratorClient {

    public static void main(String[] args) {

        Candidate candidate = new Candidate("John", "Doe", true, "");
        CommunityEvaluator crimeEvaluator = new CommunityEvaluator(
                new ExperienceEvaluator(new CrimeEvaluator(new ResidentialEvaluator())));

        evaluateCandidate(candidate, crimeEvaluator);
    }

    private static void evaluateCandidate(Candidate candidate, Evaluator residentialEvaluator) {

        System.out.println(String.format("Evaluating: %s %s", candidate.get_firstName(), candidate.get_lastName()));

        System.out.println(residentialEvaluator.evaluate(candidate));
    }
}