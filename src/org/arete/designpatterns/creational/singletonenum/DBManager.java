/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.singletonenum;

public enum DBManager {

    INSTANCE;

    private int data = 100;

    private DBManager() {
        System.out.println("Creating...");
    }

    public synchronized void incrementData() {
        data++;
    }

    public synchronized int getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getClass().getSimpleName(), hashCode());
    }
}
