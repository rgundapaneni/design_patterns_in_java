/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.visitor;

public class PostageVisitor implements Visitor {

    private double totalPostage = 0.0;

    @Override
    public void visit(Book book) {

        if(book.getPrice() < 10) {
            totalPostage += book.getWeight() * 0.01;
        }
    }

    @Override
    public void visit(Commodity commodity) {

        totalPostage += commodity.getSize() * 0.05;
    }

    @Override
    public void visit(Kindle kindle) {

        if(kindle.getModel().equals("Oasis")) {
            totalPostage += 1.0;
        } else {
            totalPostage += 1.5;
        }
    }

    public double getTotalPostage() {
        return totalPostage;
    }
}
