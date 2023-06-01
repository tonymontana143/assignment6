import java.util.Map;

public class Vertex<V> {
    private V data;  // Represents the data associated with the vertex

    // Represents the map of adjacent vertices and their corresponding edge weights
    private Map<Vertex<V>, Double> adjacentVertices;

    public V getData() {
        return data;
    }

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);  // Adds an adjacent vertex and its weight to the map
    }

    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;  // Returns the map of adjacent vertices and their weights
    }

    public String toString() {
        return String.valueOf(data);  // Returns a string representation of the vertex's data
    }

}