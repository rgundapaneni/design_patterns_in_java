/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.abstractfactory1;

import org.arete.util.PackageUtil;

import java.util.Map;

public class MammalFactory extends AbstractSpeciesFactory {

    @Override
    public Animal getAnimal(String type) {

        Map<String, Class> classList =
                    PackageUtil.getClassesBySuperClass(Mammal.class);

        return (Animal) GenericObjectFactory.makeObject(
                                classList.get(type).getName());
    }
}