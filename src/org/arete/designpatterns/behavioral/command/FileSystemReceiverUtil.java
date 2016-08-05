/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.command;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getFileSystemReceiver() {

        FileSystemReceiver fileSystemReceiver;

        String osShortName = getOSShortName();

        switch (osShortName) {

            case "Mac":
                fileSystemReceiver = new MacFileSystemReceiver();
                break;
            case "Windows":
            default:
                fileSystemReceiver = new WindowsFileSystemReceiver();

        }

        return fileSystemReceiver;
    }

    private static String getOSShortName() {

        String osName = System.getProperty("os.name");
        Matcher matcher = Pattern.compile("^(\\w+)\\s").matcher(osName);
        matcher.find();

        return matcher.group(1);
    }
}
