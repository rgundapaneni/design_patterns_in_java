/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.proxy.remote;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RemoteServer implements Greeter {

    @Override
    public String greet(String name) throws RemoteException {
        System.out.println("Greeting from server");
        return "Hello " + name;
    }

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {

        RemoteServer server = new RemoteServer();
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");

        Remote remote = UnicastRemoteObject.exportObject(server, 8002);
        Registry registry = LocateRegistry.createRegistry(8002);

        registry.bind("Server", remote);

        System.out.println("Server is running...");
    }
}
