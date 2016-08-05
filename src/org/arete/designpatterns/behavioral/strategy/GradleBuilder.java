/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.strategy;

public class GradleBuilder implements Builder {

    @Override
    public void buildCode() {
        System.out.println("Building code in Gradle");
    }
}
