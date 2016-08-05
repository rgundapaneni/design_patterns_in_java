/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.visitor;

public interface Visitor {

    public void visit(Book book);

    public void visit(Commodity commodity);

    public void visit(Kindle kindle);
}