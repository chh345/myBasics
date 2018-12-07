package de.christoph_hanauer.java.forest;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;

public class NativeDijkstra {

    private ArrayList<GraphNode> collection;
    private PriorityQueue<GraphNode> workQueue = new PriorityQueue<>();

    public NativeDijkstra(ArrayList<GraphNode> col) {
        this.collection = col;
    }

    public void path(GraphNode start, GraphNode end) {
        start.leadsTo();
    }

}
