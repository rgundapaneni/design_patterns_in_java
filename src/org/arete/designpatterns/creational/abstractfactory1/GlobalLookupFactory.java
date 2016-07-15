/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.abstractfactory1;

public class GlobalLookupFactory {

    public static AbstractSpeciesFactory getSpeciesFactory(Class speciesType) {

        String className = speciesType.getName() + "Factory";
        return  (AbstractSpeciesFactory) GenericObjectFactory.makeObject(className);
    }
}
