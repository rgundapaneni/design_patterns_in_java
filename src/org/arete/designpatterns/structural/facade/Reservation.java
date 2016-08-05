/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.facade;

public class Reservation {

    private String firstName;
    private String lastName;

    private HotelReservation hotelReservation;
    private FlightReservation flightReservation;
    private CarReservation carReservation;

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setHotelReservation(HotelReservation hotelReservation) {

        this.hotelReservation = hotelReservation;
    }

    public void setFlightReservation(FlightReservation flightReservation) {
        this.flightReservation = flightReservation;
    }

    public void setCarReservation(CarReservation carReservation) {

        this.carReservation = carReservation;
    }

    public String toString() {


        String name = new String(firstName + " " + lastName);


        return String.format("Reservation details for: %s" +
                            "\nHotel Reservation:\n%s" +
                            "\nFlight Reservation:\n%s" +
                            "\nCar Reservation:\n%s",
                            name, hotelReservation, flightReservation, carReservation);
    }
}
