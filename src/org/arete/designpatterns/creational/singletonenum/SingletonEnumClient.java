/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.singletonenum;

import org.arete.util.ThreadUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonEnumClient {

    private static void createDBInstance() {
        DBManager dbManager = DBManager.INSTANCE;
        dbManager.incrementData();
        System.out.println(String.format("%s %d", dbManager, dbManager.getData()));
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(SingletonEnumClient::createDBInstance);
        executorService.submit(SingletonEnumClient::createDBInstance);

        ThreadUtil.sleep(2000);

        executorService.shutdown();

        DBManager dbManager = DBManager.valueOf("INSTANCE");
        System.out.println(dbManager);
    }
}
