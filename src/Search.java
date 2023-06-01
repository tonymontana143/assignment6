import java.util.*;

public class Search<Vertex> {
    private WeightedGraph<Vertex> graph;

    public Search(WeightedGraph<Vertex> graph) {
        this.graph = graph;  // Initializes the graph for searching
    }

    public WeightedGraph<Vertex> getGraph() {
        return graph;  // Returns the graph used for searching
    }

    public boolean pathExist(Vertex source, Vertex destination) {
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        visited.add(source);
        queue.offer(source);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();

            if (current.equals(destination)) {
                return true;  // Returns true if the destination vertex is reached
            }

            List<Edge<Vertex>> adjacentEdges = graph.getAdjacentEdges(current);
            for (Edge<Vertex> edge : adjacentEdges) {
                Vertex neighbour = edge.getDestination();
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.offer(neighbour);  // Adds the unvisited neighboring vertices to the queue
                }
            }
        }

        return false;  // Returns false if the destination vertex is not reachable
    }

}