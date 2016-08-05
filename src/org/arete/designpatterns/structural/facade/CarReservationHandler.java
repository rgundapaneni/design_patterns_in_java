/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.facade;

public class CarReservationHandler {
    public CarReservation reserveCar() {
        return new CarReservation("Deluxe Car", "With Car Rental");
    }
}
