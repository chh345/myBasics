package de.christoph_hanauer.java.forest;

import java.util.ArrayList;

public class GraphNode extends Comparable<GraphNode> {

    String descriptor;
    ArrayList<BinaryEdge> routes = new ArrayList();

    GraphNode(String descriptor) {
        this.descriptor = descriptor;
    }

    int addRoute(BinaryEdge b) {
        int index = routes.indexOf(b);
        if (index == -1) {
            routes.add(b);
            index = routes.size() - 1;
        }
        return index;
    }

    void to (GraphNode g, int distance) {
        BinaryEdge b = new BinaryEdge<GraphNode>(distance, this, g);
        addRoute(b);
    }

    public String getDescriptor() {
        return descriptor;
    }

    public String toString() {
        return descriptor;
    }

    @Override
        public int compareTo(GraphNode o) {
        return 0;
    }
}
