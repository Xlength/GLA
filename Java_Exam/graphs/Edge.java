package graphs;

import java.util.Objects;

/**
 * Represents a directed edge in a graph.
 */
public class Edge {
    private final Node from;
    private final Node to;

    /**
     * Constructor to initialize an edge with a start and end node.
     * @param from the starting node
     * @param to the ending node
     */
    public Edge(Node from, Node to) {
        this.from = from;
        this.to = to;
    }

    public Node getFrom() {
        return from;
    }

    public Node getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "(" + from + ", " + to + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Edge)) return false;
        Edge other = (Edge) obj;
        return from.equals(other.from) && to.equals(other.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
