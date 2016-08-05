/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.facade;

public class CarReservation {

    private String type;
    private String insurance;

    public CarReservation(String type, String insurance) {
        this.type = type;
        this.insurance = insurance;
    }

    public String toString() {

        return String.format("%s %s", type, insurance);
    }
}
