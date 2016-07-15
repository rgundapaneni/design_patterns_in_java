/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.factorymethod;

public class SalesEngineer extends Employee {
    @Override
    protected FlightReservation reserveFlight() {
        return new EconomyFlightReservation();
    }

    @Override
    protected HotelBooking bookHotel() {
        return new ThreeStarHotelBooking();
    }

    @Override
    protected CarRental rentCar() {
        return new DeluxeCarRental();
    }
}
