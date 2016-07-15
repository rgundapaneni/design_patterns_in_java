/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.util;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PackageUtil {

    public static Map<String, Class> getClassesBySuperClass(Class speciesClass) {

        Map<String, Class> filteredClasses = new HashMap<>();

        List<Class> allClassesInPackage = findAllClassesInPackage(speciesClass.getPackage().getName());

        allClassesInPackage
                .stream()
                .filter(
                    klass -> {
                            if (klass.getName().equals(speciesClass.getName())) {
                                return false;
                            }

                            if(speciesClass.isAssignableFrom(klass)) {
                                return true;
                            }
                            return false;
                    }
                )
                .forEach(
                    klass ->
                        filteredClasses.put(klass.getSimpleName(), klass)
                );

        return filteredClasses;
    }

    private static List<Class> findAllClassesInPackage(String packageName) {

        List<Class> classList = new ArrayList<>();

        String packageFullPath = findPackageFullPath(packageName);

        File[] allFiles = (new File(packageFullPath)).listFiles();
        for (File file : allFiles) {
            if (file.getName().contains(".class") && !file.getName().contains("$")) {

                String klassName = packageName + "." + file.getName().split("\\.")[0];
                try {

                    classList.add(Class.forName(klassName));

                } catch (ClassNotFoundException e) { e.printStackTrace(); }
            }
        }

        return classList;
    }

    private static String findPackageFullPath(String packageName) {

        Matcher dotMatcher = Pattern.compile("(\\w+)[\\.]?").matcher(packageName);

        String packagePath = getClassPathRoot();

        while (dotMatcher.find()) {

            if(packagePath.endsWith(File.separator)) {
                packagePath += dotMatcher.group(1);
            } else {
                packagePath += File.separator + dotMatcher.group(1);
            }

        }

        return packagePath;
    }

    private static String getClassPathRoot() {

        String classPathRoot = "";

        try {
            classPathRoot = PackageUtil.class.getProtectionDomain().getCodeSource()
                    .getLocation().toURI().getPath();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return classPathRoot;
    }
}