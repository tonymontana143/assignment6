# assignment6
This project implements two graph search algorithms, `Breadth-First Search (BFS)` and `Dijkstra's algorithm`, to find paths in a weighted graph. 
The code is written in Java and provides a `Search` class as the base class, `BreadthFirstSearch` class that extends `Search` for `BFS`, and `DijkstraSearch` class
that extends Search for Dijkstra's algorithm.

# Usage
*Create a `WeightedGraph` object and add vertices and weighted edges using the addVertex and addEdge methods.

*Create an instance of `BreadthFirstSearch or DijkstraSearch`, passing the WeightedGraph object to the constructor.

*Use the `pathExist` method to check if a path exists between two vertices.

*Use the `findShortestPath` method to find the shortest path between two vertices.


# Methods
`Breadth-First Search (BFS)`: It explores all the vertices of a graph in breadth-first order and determines if a path exists between two given vertices.

`Dijkstra's Algorithm`: It finds the shortest path between two vertices in a weighted graph by considering the weights of the edges.
