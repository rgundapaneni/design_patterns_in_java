/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.facade;

import java.util.Date;

public class FlightReservationHandler {

    public FlightReservation reserveFlight(String fromCity, String toCity, TravellerProfile travellerProfile) {

        String rewardsProgram = travellerProfile.getFrequentFlyerNumber() > 1000 ? "FrequentFlyer" : "Loyal";

        FlightReservation flightReservation = new FlightReservation("AA", new Date(), true,
                new Date((new Date()).getTime() + 400000), "First Class",
                fromCity, toCity, rewardsProgram);

        return flightReservation;
    }
}
