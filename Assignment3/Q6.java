package Assignment3;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []n= {5,3,8,2,1};
		Arrays.sort(n);
		System.out.println("Sorted array:"+Arrays.toString(n));
		System.out.println("Enter element to search:");
		int s=sc.nextInt();
		int i=Arrays.binarySearch(n,s);
		if(i>=0)
			System.out.println("Element found at index:"+i);
		else
			System.out.println("Element not found");
		System.out.println("Enter an index to access:");
		int ai=sc.nextInt();
		try {
			System.out.println("Element at index "+ai+":"+n[ai]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter a valid index between o and"+(n.length-1));
		}
	}

}
