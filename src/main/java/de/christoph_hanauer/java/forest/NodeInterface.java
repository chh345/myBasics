package de.christoph_hanauer.java.forest;

import java.util.ArrayList;

public interface NodeInterface<T> {

    public String getDescriptor();

    public int compareTo(Object o);

    // public ArrayList<GraphNode> leadsTo();

}
