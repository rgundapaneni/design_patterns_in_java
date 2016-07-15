/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.abstractfactory1;

public class GenericObjectFactory {

    public static Object makeObject(String className) {

        Object object = null;

        try {
            object = Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return object;
    }
}
