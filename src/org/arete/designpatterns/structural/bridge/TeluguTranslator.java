/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.bridge;

public class TeluguTranslator implements Translator {

    @Override
    public void translate(String text) {
        if(text.equals("I would like to talk about multithreading")) {
            System.out.println("నేను మల్టీత్రెడింగ్కు గురించి మాట్లాడటానికి కోరుకుంటున్నాను");
        } else {
            System.out.println("Unfortunately, this is a naive translator... deal with it");
        }
    }
}
