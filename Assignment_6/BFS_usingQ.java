package Assignment_6;
import java.util.*;
public class BFS_usingQ {
 
	int vertices;
	List<Integer>[]adjList;
	public BFS_usingQ (int v) {
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
	void bfs(int start) {
		boolean []vis=new boolean[vertices];
		Queue<Integer>q=new LinkedList<>();
		vis[start]=true;
		q.offer(start);
		while(!q.isEmpty()) {
			int node=q.poll();
				System.out.print(node+" ");
			for(int neighbour:adjList[node]) {
				if(!vis[neighbour]) {
					vis[neighbour]=true;
					q.offer(neighbour);
				}
			
			}
		}
				
	}
	public static void main(String[] args) {
		BFS_usingQ l=new BFS_usingQ(5);
		l.addEdge(0, 1);
    	l.addEdge(0, 4);
    	l.addEdge(1, 2);
    	l.addEdge(1, 3);
    	l.addEdge(1, 4);
    	l.addEdge(2, 3);
    	l.addEdge(3, 4);
    	l.bfs(0);

	}

}
