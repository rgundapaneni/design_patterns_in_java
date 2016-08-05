/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.proxy.virtual;

class Holder {

    private Heavy heavy = null;

    public Holder() {

        System.out.println("Holder object is created");
        this.heavy = new Heavy();
    }

    public Heavy getHeavy() {

        return heavy;
    }
}

class Heavy {

    private HeavyImpl heavyImpl = null;

    public Heavy() {
        System.out.println("Heavy object is created (Not the implementation)");
    }

    public void someOperation() {

        this.getHeavy().someOperation();
    }

    public HeavyImpl getHeavy() {

        if(heavyImpl == null) {
            heavyImpl = new HeavyImpl();
        }

        return heavyImpl;
    }
}

class HeavyImpl {

    public HeavyImpl() {
        System.out.println("HeavyImpl object is created!");
    }

    public void someOperation() {

        System.out.println("Some operation is executed in HeavyImpl class");
    }
}

public class VirtualProxy {

    public static void main(String[] args) {

        Holder holder = new Holder();
        System.out.println("Object construction in the client completed, operation to be called");

        Heavy heavy = holder.getHeavy();
        heavy.someOperation();
    }
}
