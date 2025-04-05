package Assignment5;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string");
		String str=sc.nextLine();
		System.out.println("Enter character to search");
		char ch=sc.next().charAt(0);
		System.out.println("First occcurence"+str.indexOf('g'));
		System.out.println("Last occcurence"+str.lastIndexOf('g'));

	}

}
