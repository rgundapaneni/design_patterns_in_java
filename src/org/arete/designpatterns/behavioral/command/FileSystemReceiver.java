/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.command;

public interface FileSystemReceiver {

    public void openFile();

    public void writeFile();

    public void closeFile();
}
