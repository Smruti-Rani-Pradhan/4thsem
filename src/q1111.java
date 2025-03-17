
import java.util.*;

class Graph1 {
    private int vertices;
    private List<List<Node>> adjList;
    private Map<String, Integer> vertexMap;
    private Map<Integer, String> reverseVertexMap;

    class Node implements Comparator<Node> {
        int vertex;
        int weight;

        public Node() { }

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compare(Node node1, Node node2) {
            return Integer.compare(node1.weight, node2.weight);
        }
    }

    public Graph1(List<String> vertexNames) {
        this.vertices = vertexNames.size();
        adjList = new ArrayList<>();
        vertexMap = new HashMap<>();
        reverseVertexMap = new HashMap<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
            vertexMap.put(vertexNames.get(i), i);
            reverseVertexMap.put(i, vertexNames.get(i));
        }
    }

    public void addEdge(String u, String v, int weight) {
        int uIndex = vertexMap.get(u);
        int vIndex = vertexMap.get(v);
        adjList.get(uIndex).add(new Node(vIndex, weight));
        adjList.get(vIndex).add(new Node(uIndex, weight));
    }

    private void initSource(int[] dist, int[] parent, int source) {
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);
        dist[source] = 0;
    }

    public void dijkstra(String sourceName) {
        int source = vertexMap.get(sourceName);
        int[] dist = new int[vertices];
        int[] parent = new int[vertices];

        initSource(dist, parent, source);

        Set<Integer> settled = new HashSet<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(vertices, new Node());

        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            int u = pq.poll().vertex;
            settled.add(u);

            for (Node neighbor : adjList.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (!settled.contains(v) && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                    parent[v] = u;
                }
            }
        }

        printResults(source, dist, parent);
    }

    private void printResults(int source, int[] dist, int[] parent) {
        System.out.println("Vertex\tDistance\tParent");
        for (int i = 0; i < vertices; i++) {
            String vertexName = reverseVertexMap.get(i);
            System.out.println(vertexName + "\t\t" + dist[i] + "\t\t" + (parent[i] == -1 ? "None" : reverseVertexMap.get(parent[i])));
        }
    }
public class Dijkstra {

	public static void main(String[] args) {
		List<String> vertexNames = Arrays.asList("s", "w", "x", "z", "y");

        Graph1 Graph1 = new Graph1(vertexNames);
		    Graph1.addEdge("s", "w", 10);
	        Graph1.addEdge("s", "x", 5);
	        Graph1.addEdge("w", "z", 1);
	        Graph1.addEdge("w", "x", 2);
	        Graph1.addEdge("x", "w", 3);
	        Graph1.addEdge("x", "z", 9);
	        Graph1.addEdge("x", "y", 2);
	        Graph1.addEdge("y", "z", 6);
	        String source = "s";

	        Graph1.dijkstra(source);

	}
}
}

