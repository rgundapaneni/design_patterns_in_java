/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.bridge;

public class SpanishTranslator implements Translator {

    @Override
    public void translate(String text) {

        if(text.equals("Shall we talk about evolutionary design?")) {
            System.out.println("Hablamos de diseño evolutivo?");
        } else {
            System.out.println("I thought of writing a NL processor that is one step better than best one out there, I am just short of time - this is all we got, oops..");
        }
    }
}
