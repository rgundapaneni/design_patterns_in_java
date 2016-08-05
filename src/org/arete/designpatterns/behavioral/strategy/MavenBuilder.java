/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.strategy;

public class MavenBuilder implements Builder {

    @Override
    public void buildCode() {
        System.out.println("Building code in Maven");
    }
}
