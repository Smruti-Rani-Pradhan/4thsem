package Assignment3;
import java.util.Scanner;
class CustomCheckedException extends Exception{
	public CustomCheckedException(String message) {
		super(message);
	}
}
public class Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int num=sc.nextInt();
		try {
			checkPositiveNumber(num);
			System.out.println("Valid input:"+num);
		}
		catch(CustomCheckedException e) {
			System.out.println("Error:"+e.getMessage());
		}
		finally {
			sc.close();
		}
	}
	public static void checkPositiveNumber(int num)throws CustomCheckedException {
	    if(num<0) {
	    	throw new CustomCheckedException("Negative numbers are not allowed.");
	    }
	} 
}
