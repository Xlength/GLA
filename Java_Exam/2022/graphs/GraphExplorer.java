package graphs;

import java.util.HashSet;
import java.util.Set;

/**
 * Provides utility methods for exploring a graph.
 */
public class GraphExplorer {

    /**
     * Computes the complete set of edges in a graph.
     * @param nodes the nodes in the graph
     * @return a set of edges in the graph
     */
    public static Set<Edge> listEdges(Node[] nodes) {
        Set<Edge> edges = new HashSet<>();
        for (Node node : nodes) {
            for (Node neighbour : node.getNeighbours()) {
                edges.add(new Edge(node, neighbour));
            }
        }
        return edges;
    }
}
