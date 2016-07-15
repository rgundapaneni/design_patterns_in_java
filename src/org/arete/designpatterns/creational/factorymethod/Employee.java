/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.factorymethod;

public abstract class Employee {

    private FlightReservation _flight;
    private HotelBooking _hotel;
    private CarRental _car;

    public void getReadyForTravel() {

        _flight = reserveFlight();
        _hotel = bookHotel();
        _car = rentCar();
    }

    protected abstract FlightReservation reserveFlight();

    protected abstract HotelBooking bookHotel();

    protected abstract CarRental rentCar();

    @Override
    public String toString() {
        return String.format("%s: %s %s %s",
                this.getClass(), _flight, _hotel, _car);
    }
}
