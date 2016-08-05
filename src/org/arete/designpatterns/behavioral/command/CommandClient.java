/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.command;

public class CommandClient {

    public static void main(String[] args) {

        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getFileSystemReceiver();

        FileInvoker fileInvoker =
                        new FileInvoker(
                            () -> fileSystemReceiver.openFile()
                        );

        /****
         * execute method on fileInvoker calls the callback method on the command object
         */
        fileInvoker.execute();

        fileInvoker = new FileInvoker(
                () -> fileSystemReceiver.writeFile()
        );

        fileInvoker.execute();

        fileInvoker = new FileInvoker(
                            () -> fileSystemReceiver.closeFile()
                        );

        fileInvoker.execute();
    }
}
