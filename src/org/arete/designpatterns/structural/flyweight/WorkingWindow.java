/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.flyweight;

import javax.swing.*;
import java.awt.*;

public class WorkingWindow extends JFrame {

    int windowWidth = 1750;
    int windowHeight = 1000;

    JPanel drawingPanel;

    JButton startDrawing;

    public WorkingWindow() {

        this.setSize(this.windowWidth, this.windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Flyweight Pattern Example");

        this.initWindowComponents();

        this.setVisible(true);
    }

    public void initWindowComponents() {

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        drawingPanel = new JPanel();
        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        this.add(contentPane);
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public JButton getStartDrawing() {
        return startDrawing;
    }

    public JPanel getDrawingPanel() {
        return drawingPanel;
    }
}
