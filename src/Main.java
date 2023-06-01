import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create a weighted graph
        WeightedGraph<String> graph = new WeightedGraph<>();

        // Add vertices to the graph
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        // Add weighted edges to the graph
        graph.addEdge("A", "B", 5);
        graph.addEdge("A", "C", 3);
        graph.addEdge("B", "D", 2);
        graph.addEdge("C", "D", 1);
        graph.addEdge("D", "E", 4);

        // Create an instance of BreadthFirstSearch and DijkstraSearch
        BreadthFirstSearch<String> bfsSearch = new BreadthFirstSearch<>(graph);
        DijkstraSearch<String> dijkstraSearch = new DijkstraSearch<>(graph);

        // Check if a path exists between vertices A and E using BFS
        System.out.println("Path from A to E exists (BFS): " + bfsSearch.pathExist("A", "E"));

        // Check if a path exists between vertices A and E using Dijkstra's algorithm
        System.out.println("Path from A to E exists (Dijkstra): " + dijkstraSearch.pathExist("A", "E"));

        // Find the shortest path between vertices A and E using BFS
        List<String> bfsShortestPath = bfsSearch.findShortestPath("A", "E");

        // Find the shortest path between vertices A and E using Dijkstra's algorithm
        List<String> dijkstraShortestPath = dijkstraSearch.findShortestPath("A", "E");

        // Print the shortest path from A to E using BFS if it exists
        if (bfsShortestPath != null) {
            System.out.println("Shortest path from A to E (BFS): " + bfsShortestPath);
        } else {
            System.out.println("Path from A to E does not exist (BFS)");
        }

        // Print the shortest path from A to E using Dijkstra's algorithm if it exists
        if (dijkstraShortestPath != null) {
            System.out.println("Shortest path from A to E (Dijkstra): " + dijkstraShortestPath);
        } else {
            System.out.println("Path from A to E does not exist (Dijkstra)");
        }
    }
}