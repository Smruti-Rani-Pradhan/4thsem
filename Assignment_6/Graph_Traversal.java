package Assignment_6;
import java.util.*;
public class Graph_Traversal {
	int vertices;
	List<Integer>[]adjList;
	public Graph_Traversal(int v) {
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
	void DFSUsingStack(int start) {
		boolean []visited=new boolean[vertices];
		Stack<Integer>s=new Stack<>();
		s.push(start);
		while(!s.isEmpty()) {
			int node=s.pop();
			if(!visited[node]) {
				visited[node]=true;
				System.out.print(node+" ");
				List<Integer> n=adjList[node];
			for(int neighbour:n) {
				if(!visited[neighbour]) {
					s.push(neighbour);
				}
			}
			Collections.reverse(n);
			}
		}
	}
	public static void main(String[] args) {
		Graph_Traversal l=new Graph_Traversal(5);
		l.addEdge(0, 1);
    	l.addEdge(0, 4);
    	l.addEdge(1, 2);
    	l.addEdge(1, 3);
    	l.addEdge(1, 4);
    	l.addEdge(2, 3);
    	l.addEdge(3, 4);
    	l.DFSUsingStack(0);
	}

}
