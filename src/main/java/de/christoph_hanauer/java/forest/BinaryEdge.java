package de.christoph_hanauer.java.forest;

public class BinaryEdge <T> implements Comparable<T implements NodeInterface> {

    int value;

    T source;
    T destination;

    BinaryEdge(int value) {
        this.value = value;
    }

    BinaryEdge(int value, T a, T b) {
        this(value);
        this.source = a;
        this.destination = b;
    }

    String getDescriptor(T node) {
        return node.
    }

    @Override
    public int compareTo(T o) {
        String descSource = source.getDescriptor();

    }
}
