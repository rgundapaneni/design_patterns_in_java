/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.facade;

public class HotelReservation {

    private String checkinTime;
    private String checkoutTime;
    private String bedSize;
    private boolean nonSmoking;
    private boolean breakfast;

    public HotelReservation(String checkinTime, String checkoutTime,
                        String bedSize, boolean nonSmoking, boolean breakfast) {

        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.bedSize = bedSize;
        this.nonSmoking = nonSmoking;
        this.breakfast = breakfast;
    }

    public String toString() {

        return String.format("%s %s %s %b %b", checkinTime, checkoutTime, bedSize, nonSmoking, breakfast);
    }
}
