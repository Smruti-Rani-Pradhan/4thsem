package Assignment3;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a no. to find its square root");
	 int  n=sc.nextInt();
	 try {
		 if(n<=0)
			 throw new ArithmeticException("can't calculate root of -ve no.");
		 double r=Math.sqrt(n);
		 System.out.println("Squareroot:"+r);
	 }
	 catch(ArithmeticException e) {
		 System.out.println("Error:"+e.getMessage());
	 }
	}

}
