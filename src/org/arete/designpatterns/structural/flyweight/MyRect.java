/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.flyweight;

import java.awt.*;

public class MyRect {

    private Color color;

    public MyRect(Color color) {

        this.color = color;
    }

    public void draw(Graphics g, int x1, int y1, int x2, int y2) {

        g.setColor(this.color);
        g.fillRect(x1, y1, x2, y2);
    }
}
