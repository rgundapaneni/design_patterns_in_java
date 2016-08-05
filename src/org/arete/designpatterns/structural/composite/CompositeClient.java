/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.structural.composite;

public class CompositeClient {

    private static void addGateToFlipFlop(Board board, int index, Gate gate) {

        Gate parent = board.getGateAt(index);
        parent.add(gate);
    }

    public static void main(String[] args) {

        Board board = new Board();

        board.add(new AndGate());
        board.add(new AndGate());
        board.add(new OrGate());
        board.add(new FlipFlop());

        addGateToFlipFlop(board, 3, new AndGate());
        addGateToFlipFlop(board, 3, new AndGate());

        board.triggerBoard();

        System.out.println("Board has " + board.getTotalGates() + " gates");
        for(int i = 0; i <board.getTotalGates(); i++) {
            Gate gateAtLocation = board.getGateAt(i);
            System.out.println(gateAtLocation);
            if(gateAtLocation.getComponentCount() > 0) {
                System.out.println("Flipflop has " + gateAtLocation.getComponentCount() + " components");
            }
        }
    }
}
