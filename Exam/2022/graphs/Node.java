package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a node in a directed graph.
 */
public class Node {
    private final int label;
    private final List<Node> neighbours;

    /**
     * Constructor to initialize a Node with a label.
     * @param label the label of the node
     */
    public Node(int label) {
        this.label = label;
        this.neighbours = new ArrayList<>();
    }

    /**
     * Adds a neighbour to this node's adjacency list.
     * @param node the neighbour node to add
     */
    public void addNeighbour(Node node) {
        neighbours.add(node);
    }

    /**
     * Retrieves the adjacency list of this node.
     * @return the list of neighbour nodes
     */
    public List<Node> getNeighbours() {
        return neighbours;
    }

    /**
     * Retrieves the label of this node.
     * @return the label of the node
     */
    public int getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return String.valueOf(label);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Node)) return false;
        Node other = (Node) obj;
        return label == other.label;
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }
}
