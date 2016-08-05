/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.facade;

import java.util.Date;

public class FlightReservation {

    private String airline;
    private Date flightDate;
    private boolean roundtrip;
    private Date returnDate;
    private String classOfTravel;
    private String fromCity;
    private String toCity;
    private String loyaltyProgram;

    public FlightReservation(String airline, Date flightDate, boolean roundtrip, Date returnDate, String classOfTravel,
                             String fromCity, String toCity, String loyaltyProgram) {
        this.airline = airline;
        this.flightDate = flightDate;
        this.roundtrip = roundtrip;
        this.returnDate = returnDate;
        this.classOfTravel = classOfTravel;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.loyaltyProgram = loyaltyProgram;
    }

    public String toString() {

        return String.format("%s %s %b %s %s %s %s %s", airline, flightDate.toString(),
                roundtrip, returnDate.toString(), classOfTravel, fromCity, toCity, loyaltyProgram);
    }
}
