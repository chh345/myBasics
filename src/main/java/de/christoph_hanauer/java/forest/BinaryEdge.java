package de.christoph_hanauer.java.forest;

public class BinaryEdge <T extends NodeInterface> implements Comparable<BinaryEdge<T>> {

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
        return "";
    }

    @Override
    public int compareTo(BinaryEdge<T> o) {
        int d = source.compareTo(o.source);
        if (d == 0)
            d = destination.compareTo(o.destination);
        return d;
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append(source.getDescriptor() + " to " + destination.getDescriptor() + " in " + value + "\n");
        return str.toString();
    }
}
