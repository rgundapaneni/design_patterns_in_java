/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.bridge;

import java.util.Arrays;
import java.util.List;

public class BridgeClient {

    private static void giveTalk(List<Expert> experts, String language) {

        try {
            Class<Translator> translatorClass = (Class<Translator>)
                    Class.forName("org.arete.designpatterns.structural.bridge." + language + "Translator");

            for (Expert expert : experts) {
                expert.setTranslator((Translator) translatorClass.newInstance());
                expert.talk();
            }
        } catch (ClassNotFoundException|IllegalAccessException|InstantiationException e) {
            System.out.println("Seriously, do you expect me handle this exception, check the spelling?");
        }
    }

    public static void main(String[] args) {

        giveTalk(Arrays.asList(new Programmer(), new Tester(), new Architect()), "Telugu");
        giveTalk(Arrays.asList(new Programmer(), new Tester(), new Architect()), "Chinese");
        giveTalk(Arrays.asList(new Programmer(), new Tester(), new Architect()), "Spanish");
    }
}
