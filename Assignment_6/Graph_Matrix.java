package Assignment_6;

public class Graph_Matrix {
	int [][] adjMatrix;
	int numV;
	public Graph_Matrix(int numV) {
		this.numV=numV;
		adjMatrix=new int[numV][numV];
		}
	public void addEdge(int i,int j) {
		adjMatrix [i][j]=1; //for undirected graph
		adjMatrix [j][i]=1;
		}
	public void removeEdge(int i,int j) {
		adjMatrix [i][j]=0; //for undirected graph
		adjMatrix [j][i]=0;
	}
	public void printMatrix() {
		for(int i=0;i<numV;i++) {
			for(int j=0;j<numV;j++) {
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Graph_Matrix g=new Graph_Matrix(5);
		g.addEdge(0,1);
		g.addEdge(0,4);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(1,4);
		g.addEdge(2,3);
		g.addEdge(3,4);
		System.out.println("Orig graph:");
		g.printMatrix();
		g.addEdge(2, 4);
		System.out.println("after adding edge");
		g.printMatrix();
		
		
		

	}

}
