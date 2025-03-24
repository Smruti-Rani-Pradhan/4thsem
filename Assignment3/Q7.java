package Assignment3;
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int [][]a= {
			 {1,2,3},
			 {4,5,6},
			 {7,8,9}
	 };
	 int [][]b= {
			 {9,8,7},
			 {6,5,4},
			 {3,2,1}
	 };
	 System.out.println("Matrix A:");
     PrintMatrix(a);
     System.out.println("Matrix B:");
     PrintMatrix(b);
     System.out.println("Addition of matrix:");
     int [][] sum=addMatrices(a,b);
     PrintMatrix(sum);
     System.out.println("Multiplication of matrices:");
     int [][] mult=multMatrices(a,b);
     PrintMatrix(mult);
     System.out.println("Transpose of matrix A:");
     int [][] t=transposeMatrices(a);
     PrintMatrix(t);
     System.out.println("Enter row index to access:");
     int r=sc.nextInt();
     System.out.println("Enter column index to access:");
     int c=sc.nextInt();
     try {
    	 System.out.println("Element at("+r+","+c+"):"+a[r][c]);
     }
     catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter a valid index ");
		} 
}
	public static int[][] addMatrices(int [][]a,int [][]b){
		int row=a.length;
		int col=a[0].length;
		int [][] r=new int [row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				r[i][j]=a[i][j]+b[i][j];
			}
		}
		return r;
	}
	public static int[][] multMatrices(int [][]a,int [][]b){
		int row=a.length;
		int col=b[0].length;
		int [][] r=new int [row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				r[i][j]+=a[i][j]*b[i][j];
			}
		}
		return r;
	}
	
	public static int[][] transposeMatrices(int [][]a){
		int row=a.length;
		int col=a[0].length;
		int [][] transpose=new int [row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				transpose[j][i]+=a[i][j];
			}
		}
		return transpose;
	}
	
	public static void PrintMatrix(int [][]a){
		
		for(int[] row:a) {
			for(int value:row) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
	
	}

}
