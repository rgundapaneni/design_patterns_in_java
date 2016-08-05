/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.templatemethod;

public class DevelopJavaCode extends Develop {

    @Override
    public void writeCode() {
        System.out.println("Writing code in java");
    }

    @Override
    public void buildCode() {
        System.out.println("Compiling code with javac");
    }

    @Override
    public void testCode() {
        System.out.println("Testing code in JUnit");
    }
}