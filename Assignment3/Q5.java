package Assignment3;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			String input=sc.nextLine();
		try {
			int num=Integer.parseInt(input);
			try {
				int r=100/num;
				System.out.println("Result:"+r);
				}
			catch(ArithmeticException e) {
				System.out.println("Inner Catch:Divison by zero not allowed!");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("enter valid number");
			
		}

	}

}
