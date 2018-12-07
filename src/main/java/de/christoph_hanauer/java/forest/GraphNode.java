package de.christoph_hanauer.java.forest;

import java.util.ArrayList;

public class GraphNode implements NodeInterface {

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

    public ArrayList<GraphNode> leadsTo () {
        ArrayList<GraphNode> leads = new ArrayList<>();
        for (BinaryEdge b : routes) {
            leads.add((GraphNode)b.destination);
        }
        return leads;
    }

    public String getDescriptor() {
        return descriptor;
    }

    @Override
    public int compareTo(Object o) {
        GraphNode g = (GraphNode) o;
        return this.descriptor.compareTo(g.getDescriptor());
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        for (BinaryEdge b : routes)
            str.append(b);
        return str.toString();
    }
}
