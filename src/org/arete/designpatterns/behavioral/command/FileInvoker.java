/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.command;

public class FileInvoker {

    private Command cmd;

    public FileInvoker(Command cmd) {

        this.cmd = cmd;
    }

    public void execute() {

        cmd.execute();
    }
}
