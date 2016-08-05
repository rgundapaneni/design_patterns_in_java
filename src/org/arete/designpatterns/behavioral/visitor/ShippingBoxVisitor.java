/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShippingBoxVisitor implements Visitor {

    List<Visitable> boxes = new ArrayList<>();

    public List<Visitable> getBoxes() {
        return boxes;
    }

    @Override
    public void visit(Book book) {

        boxes.add(book);
    }

    @Override
    public void visit(Commodity commodity) {

        boxes.add(commodity);
    }

    @Override
    public void visit(Kindle kindle) {

        boxes.add(kindle);
    }
}
