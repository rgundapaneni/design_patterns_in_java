/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.templatemethod;

public class DevelopCSCode extends Develop {

    @Override
    public void writeCode() {
        System.out.println("Writing code in CS");
    }

    @Override
    public void buildCode() {
        System.out.println("Building code with CSC");
    }

    @Override
    public void testCode() {
        System.out.println("Testing code with NUnit");
    }
}
