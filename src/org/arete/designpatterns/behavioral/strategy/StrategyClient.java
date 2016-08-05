/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.strategy;

public class StrategyClient {

    private static void work(Develop develop) {

        develop.code();
    }

    public static void main(String[] args) {

        System.out.println("Project 1: .....");
        work(new Develop(
                new JavaCoder(), new MavenBuilder(), new JUnitTester()
        ));

        System.out.println("Project 2: .....");
        work(new Develop(
                new ScalaCoder(), new GradleBuilder(), new SpockTester()
        ));
    }
}
