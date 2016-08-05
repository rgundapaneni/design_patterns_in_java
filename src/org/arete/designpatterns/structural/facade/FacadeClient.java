/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.facade;

import java.util.Date;

public class FacadeClient {

    public static void main(String[] args) {

        TravelAgent travelAgent = TravelAgent.INSTANCE;
        Reservation reservation = travelAgent.reserve(new Date(), new Date(), "San Jose", "New York",
                            new TravellerProfile("John", "Doe", 2150L));

        System.out.println(reservation);
    }
}