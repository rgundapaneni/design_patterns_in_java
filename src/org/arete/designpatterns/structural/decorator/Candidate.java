/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.decorator;

public class Candidate {

    private final String _firstName;
    private final String _lastName;
    private final boolean _qualified;
    private final String _evaluations;

    public Candidate(String firstName, String lastName, boolean qualified, String evaluations) {

        _firstName = firstName;
        _lastName = lastName;
        _qualified = qualified;
        _evaluations = evaluations;
    }

    public String get_firstName() {
        return _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public boolean is_qualified() {
        return _qualified;
    }

    public String get_evaluations() {
        return _evaluations;
    }

    public String toString() {

        return String.format("%s %s is evaluated, person is qualified: %b for reasons: %s",
                _firstName, _lastName, _qualified, _evaluations);
    }
}
