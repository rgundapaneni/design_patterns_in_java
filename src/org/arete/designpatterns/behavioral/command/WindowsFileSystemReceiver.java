/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.command;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {

        System.out.println("Inner details of open file in Windows");
    }

    @Override
    public void writeFile() {

        System.out.println("Inner details of write file in Windows");
    }

    @Override
    public void closeFile() {

        System.out.println("Inner details of close file in Windows");
    }
}