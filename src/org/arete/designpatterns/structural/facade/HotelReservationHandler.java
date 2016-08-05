/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.facade;

public class HotelReservationHandler {

    public HotelReservation reserveHotel(String city) {

        HotelReservation hotelReservation =
                new HotelReservation("08/11/2016 11:00 AM", "08/15/2016 12:00 PM", "King", true, false);

        return hotelReservation;
    }
}
