/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.singletongof;

public class DBManager {

    private static DBManager _instance;

    private DBManager() {

        if(_instance != null) {
            throw new RuntimeException("Oops... an instance already exists");
        }
        System.out.println("Creating...");
    }

    public static DBManager getInstance() {

        System.out.println("Entering...");
        if(_instance == null) {

            //ThreadUtil.sleep(2000);
            synchronized (DBManager.class) {
                System.out.println("Checking again...");
                if(_instance == null) {
                    _instance = new DBManager();
                }
            }
        }

        return _instance;
    }

    @Override
    public String toString() {

        return String.format("%s %s", getClass().getSimpleName(), hashCode());
    }
}
