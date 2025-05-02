package Assignment_6;
import java.util.*;
public class AdjacencyList {
	int vertices;
	List<Integer>[]adjList;
	public AdjacencyList(int v) {
		vertices=v;
		adjList=new ArrayList[v];
		for(int i=0;i<v;i++) {
			adjList[i]=new ArrayList<>();
		}
	}
	public void addEdge(int u,int v) {
		adjList[u].add(v);
		adjList[v].add(u);
	}
	public void printList() {
		for(int i=0;i<vertices;i++) {
			System.out.println(i+"->");
			for(int node:adjList[i]) {
				System.out.print(node+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		AdjacencyList l=new AdjacencyList(5);
		l.addEdge(0, 1);
    	l.addEdge(0, 4);
    	l.addEdge(1, 2);
    	l.addEdge(1, 3);
    	l.addEdge(1, 4);
    	l.addEdge(2, 3);
    	l.addEdge(3, 4);
    	l.printList();
	}

}
