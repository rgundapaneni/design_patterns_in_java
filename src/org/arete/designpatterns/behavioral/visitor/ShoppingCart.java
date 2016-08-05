/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Visitable> shoppingItems = new ArrayList<>();
    private List<String> invoiceItems = new ArrayList<>();

    public void loadCart() {

        shoppingItems.add(new Book(10.25, 15));
        shoppingItems.add(new Commodity(100));
        shoppingItems.add(new Kindle(KidleModel.Oasis.toString()));
    }

    public void checkout() {

        PostageVisitor postageVisitor = new PostageVisitor();
        ShippingBoxVisitor shippingBoxVisitor = new ShippingBoxVisitor();

        for(Visitable visitable : shoppingItems) {

            visitable.accept(postageVisitor);
            visitable.accept(shippingBoxVisitor);
        }

        invoiceItems.add("Total Postage: " + postageVisitor.getTotalPostage());
        invoiceItems.add("Boxes: " + shippingBoxVisitor.getBoxes());
    }

    public List<String> getInvoiceItems() {
        return invoiceItems;
    }
}
