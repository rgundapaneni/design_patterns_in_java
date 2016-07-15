/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.util;

public class ThreadUtil {

    public static void sleep(int millis) {

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
