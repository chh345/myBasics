package de.christoph_hanauer.java.forest;

import java.util.ArrayList;

public class BinaryGraphImpl {

    public static void main(String [] args) {
        GraphNode A = new GraphNode("A");
        GraphNode B = new GraphNode("B");
        GraphNode C = new GraphNode("C");
        GraphNode D = new GraphNode("D");
        GraphNode E = new GraphNode("E");

        A.to(B, 3);
        A.to(C, 7);
        B.to(C, 1);
        B.to(E, 5);
        C.to(D, 5);
        D.to(E, 2);

        ArrayList<GraphNode> a = new ArrayList();
        a.add(A);
        a.add(B);
        a.add(C);
        a.add(D);
        a.add(E);

        for (GraphNode g : a) {
            System.out.println(g);
        }

    }

    private static void printTree(GraphNode startNode) {

    }

}
