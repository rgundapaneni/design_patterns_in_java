/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.iterator;

import java.util.*;

public class IteratorClient {

    private static void iterateAndPrint(Iterator<Person> iterator) {

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
            new Person("John", "Doe"),
            new Person("Chris", "Walker"),
            new Person("James", "Hill")
        );

        Set<Person> peopleSet = new HashSet<>(
                Arrays.asList(
                        new Person("Tim", "Banner"),
                        new Person("Sarah", "Penn"),
                        new Person("Miranda", "Hawk")
                )
        );

        iterateAndPrint(people.iterator());
        iterateAndPrint(peopleSet.iterator());
    }
}