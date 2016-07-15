/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.bridge;

public class ChineseTranslator implements Translator {

    @Override
    public void translate(String text) {
        if (text.equals("I would like to talk about Test Automation")) {
            System.out.println("我想谈谈自动化测试");
        } else {
            System.out.println("Oops.. something is amiss, what that might be? debug the code");
        }
    }
}
