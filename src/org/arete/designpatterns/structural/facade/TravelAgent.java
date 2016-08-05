/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.facade;

import java.util.Date;

public enum TravelAgent {

    INSTANCE;

    private Reservation reservation = new Reservation();

    public Reservation reserve(Date travelDate, Date returnDate, String fromCity, String toCity,
                               TravellerProfile travellerProfile) {

        this.reservation.setName(travellerProfile.getFirstName(), travellerProfile.getLastName());
        this.reserveHotel(toCity);
        this.reserveFlight(fromCity, toCity, travellerProfile);
        this.reserveCar();

        return this.reservation;
    }

    /***
     * Handles hotel reservation
     */
    private void reserveHotel(String city) {

        HotelReservation hotelReservation = (new HotelReservationHandler()).reserveHotel(city);
        this.reservation.setHotelReservation(hotelReservation);
    }

    /***
     * Handles flight reservation
     */
    private void reserveFlight(String fromCity, String toCity, TravellerProfile travellerProfile) {

        FlightReservation flightReservation = (new FlightReservationHandler()).reserveFlight(
                                                                fromCity, toCity, travellerProfile);
        this.reservation.setFlightReservation(flightReservation);
    }

    /***
     * Handles Car reservation
     */
    private void reserveCar() {

        CarReservation carReservation = (new CarReservationHandler()).reserveCar();
        this.reservation.setCarReservation(carReservation);
    }
}
