package Assignment5;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		System.out.println("Enter 1st string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("Enter 2nd string");
		String s2=sc.nextLine();  

		String s1LC=s1.toLowerCase();
		String s1UC=s1.toUpperCase();
		
		String s2LC=s2.toLowerCase();
		String s2UC=s2.toUpperCase();
		
		boolean isEqual=s1LC.equals(s2UC);
		
		System.out.println("First string Lower Case: "+s1LC);
		System.out.println("First string Upper Case: "+s1UC);
		System.out.println("Second string Lower Case: "+s2LC);
		System.out.println("Second string Upper Case: "+s2UC);
		System.out.println("\n Result of case insensitiveness:");
		if(isEqual) {
			
		
			System.out.println("String are case insensitive");
		}
	else {
			
		System.out.println("String are case sensitive");
		}
	}
	}