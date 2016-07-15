/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.factorymethod;

public class SalesExecutive extends Employee {

    @Override
    protected FlightReservation reserveFlight() {
        return new FirstClassFlightReservation();
    }

    @Override
    protected HotelBooking bookHotel() {
        return new FiveStarHotelBooking();
    }

    @Override
    protected CarRental rentCar() {
        return new DeluxeCarRental();
    }
}
