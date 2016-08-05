/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.memento;

import java.util.Random;
import java.util.Scanner;

public class MementoClient {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        Scanner scanner = new Scanner(System.in);
        int input;

        //Didn't handle the edge cases, choose the indices carefully
        //Quick and dirty way to demo the concept
        while((input = getNextInt(scanner)) != 4) {

            switch (input) {

                case 1:
                    modifyOperation(originator);
                    break;
                case 2:
                    saveOperation(originator, careTaker);
                    break;
                case 3:
                    int index = getSnapshotIndex(scanner);
                    restoreOperation(originator, careTaker, index);
                    break;
            }

            System.out.println("Originator");
            System.out.println(originator);
            System.out.println("Care Taker");
            System.out.println(careTaker);
        }
    }

    private static void modifyOperation(Originator originator) {

        Random random = new Random();
        int number = random.nextInt(1000);

        originator.setState(Integer.toString(number));
    }

    private static void saveOperation(Originator originator, CareTaker careTaker) {

        Memento memento = originator.saveToMemento();
        careTaker.saveState(memento);
    }

    private static void restoreOperation(Originator originator, CareTaker careTaker, int index) {

        originator.restoreFromMemento( careTaker.getSnapshot(index) );
    }

    private static int getNextInt(Scanner scanner) {

        System.out.print("Enter 1: Modify 2: Save 3: restore 4: Quit: ");
        int value = scanner.nextInt();

        return value;
    }

    private static int getSnapshotIndex(Scanner scanner) {

        System.out.print("Enter snapshot index to restore: ");
        int value = scanner.nextInt();

        return value;
    }
}
