/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.facade;

public class TravellerProfile {

    private String firstName;
    private String lastName;

    private Long frequentFlyerNumber;

    public TravellerProfile(String firstName, String lastName, Long frequentFlyerNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.frequentFlyerNumber = frequentFlyerNumber;
    }

    public Long getFrequentFlyerNumber() {
        return frequentFlyerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
