/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.singletongof;

import org.arete.util.ThreadUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonGOFClient {

    private static void newDBManagerInstance() {

        DBManager dbManager = DBManager.getInstance();
        System.out.println(dbManager);
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(SingletonGOFClient::newDBManagerInstance);
        executorService.submit(SingletonGOFClient::newDBManagerInstance);

        ThreadUtil.sleep(1000);

        executorService.submit(SingletonGOFClient::newDBManagerInstance);

        ThreadUtil.sleep(2000);

        executorService.shutdown();

        /*
        Constructor dbConstructor = DBManager.class.getDeclaredConstructor();
        dbConstructor.setAccessible(true);
        System.out.println(dbConstructor.newInstance());
        */
    }
}
