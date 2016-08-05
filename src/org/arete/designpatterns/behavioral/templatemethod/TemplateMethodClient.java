/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.templatemethod;

public class TemplateMethodClient {

    private static void work(Develop develop) {

        develop.code();
    }

    public static void main(String[] args) {

        work(new DevelopJavaCode());
        work(new DevelopCSCode());
    }
}
