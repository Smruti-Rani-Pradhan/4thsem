package Assignment3;
import java.util.*;

public class Q3 {
	
	public static int Convert(String input) {
		Scanner sc=new Scanner(System.in);
		int num;
		while(true) {
			try {
			 num=Integer.parseInt(input);
			 break;
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid input:enter a valid one.");
				input =sc.nextLine();
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Emter a number");
		String st=sc.nextLine();
		int result=Convert(st);
		System.out.println("Converted number:"+result);
	}

}
