/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityClient {

    public static void main(String[] args) {

        OurDataHandler aboveThresholdHandler = new AboveThresholdHandler(900);
        OurDataHandler evenHandler = new EvenNumberHandler(aboveThresholdHandler);
        OurDataHandler belowThresholdHandler = new BelowThresholdHandler(evenHandler, 100);

        OurDataSource ourDataSource = new OurDataSource();
        ourDataSource.addListener(belowThresholdHandler);

        ourDataSource.start();
    }
}
