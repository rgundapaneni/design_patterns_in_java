/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.creational.factorymethod;

public class FactoryMethodClient {

    private static void prepareEmployeeForTravel(Employee employee) {

        employee.getReadyForTravel();
        System.out.println(employee);
    }

    public static void main(String[] args) {

        SoftwareDeveloper itPerson = new SoftwareDeveloper();
        prepareEmployeeForTravel(itPerson);

        SalesExecutive salesExec = new SalesExecutive();
        prepareEmployeeForTravel(salesExec);

        SalesEngineer salesEngineer = new SalesEngineer();
        prepareEmployeeForTravel(salesEngineer);
    }
}
