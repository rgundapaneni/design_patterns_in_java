/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Greeter extends Remote {

    public String greet(String name) throws RemoteException;
}
