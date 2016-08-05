/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.flyweight;

import java.awt.*;
import java.util.Random;

public class WindowActionManager {

    private WorkingWindow workingWindow;

    Color[] shapeColor = { Color.orange, Color.red, Color.yellow,
            Color.blue, Color.pink, Color.cyan,
            Color.magenta, Color.black, Color.gray };

    public WindowActionManager(WorkingWindow workingWindow) {

        this.workingWindow = workingWindow;
    }

    public void bindActions() {

        this.workingWindow.getStartDrawing().addActionListener(e -> {

            Graphics g = this.workingWindow.getDrawingPanel().getGraphics();

            long startTime = System.currentTimeMillis();
            for (int i=0; i<100000; i++) {

                //FlyWeight pattern is operation here

                //Object is created multiple times here:
                //MyRect myRect = new MyRect(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
                //myRect.draw(g);

                MyRect myRect = RectFactory.getRect(getRandColor());
                myRect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
            }
            long endTime = System.currentTimeMillis();

            System.out.println("Total process took " + (endTime-startTime) + "ms");
        });
    }

    private Color getRandColor() {

        Random random = new Random();
        return shapeColor[random.nextInt(9)];
    }

    private int getRandX() {
        return (int)(Math.random() * workingWindow.getWindowWidth());
    }

    private int getRandY() {
        return (int)(Math.random() * workingWindow.getWindowHeight());
    }
}
