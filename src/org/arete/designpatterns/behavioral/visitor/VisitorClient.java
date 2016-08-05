/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.visitor;

public class VisitorClient {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.loadCart();
        shoppingCart.checkout();

        shoppingCart.getInvoiceItems().forEach(System.out::println);
    }
}
