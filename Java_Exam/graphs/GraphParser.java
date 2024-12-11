package graphs;

/**
 * Parses a graph specification and creates an array of Nodes.
 */
public class GraphParser {

    /**
     * Parses a graph specification and returns an array of nodes.
     * @param spec the graph specification as a string
     * @return an array of nodes representing the graph
     */
    public static Node[] parseGraph(String spec) {
        String[] lines = spec.split("\n");
        int nodeCount = Integer.parseInt(lines[0]);
        int edgeCount = Integer.parseInt(lines[1]);

        Node[] nodes = new Node[nodeCount];
        for (int i = 0; i < nodeCount; i++) {
            nodes[i] = new Node(i + 1);
        }

        for (int i = 2; i < 2 + edgeCount; i++) {
            String[] edge = lines[i].split(" ");
            int from = Integer.parseInt(edge[0]);
            int to = Integer.parseInt(edge[1]);
            nodes[from - 1].addNeighbour(nodes[to - 1]);
        }

        return nodes;
    }
}
