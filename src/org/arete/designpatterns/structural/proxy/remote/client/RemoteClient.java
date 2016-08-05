/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.proxy.remote.client;

import org.arete.designpatterns.structural.proxy.remote.Greeter;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

class LocalGreeter implements Greeter {

    @Override
    public String greet(String name) throws RemoteException {

        return "Howdy " + name;
    }
}

public class RemoteClient {

    private static void useGreeter(Greeter greeter) throws RemoteException {

        System.out.println(greeter.greet("Earthling"));
    }

    public static void main(String[] args) throws RemoteException, NotBoundException {

        Registry registry = LocateRegistry.getRegistry(8002);
        Greeter remoteGreeter = (Greeter) registry.lookup("Server");

        //useGreeter is the proxy directing the call to remote server
        useGreeter(remoteGreeter);

        Greeter localGreeter = new LocalGreeter();
        //userGreeter is the proxy directing the call to local greeter
        useGreeter(localGreeter);

        System.out.println(remoteGreeter.getClass().getName());
        System.out.println(localGreeter.getClass().getName());
    }
}
