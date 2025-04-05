package Assignment5;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
		System.out.println("Enter the word to replace");
		String r=sc.next();
		System.out.println("Enter the word to replace it with");
		String rw=sc.next();
		
		int index=s.indexOf(r);//find the first occurence
		 if(index!=-1) {
			 StringBuilder str=new StringBuilder(s);
			 str.replace(index, index+r.length(), rw);
			 System.out.println("Original sentence:"+s);
			 System.out.println("Modified Sentence:"+str.toString());
		 }
		 else
			 System.out.println("Word not found!");
		sc.close();
		

	}

}
