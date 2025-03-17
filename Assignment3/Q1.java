package Assignment3;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a alphanumeric String:");
			String ap=sc.nextLine();
			if(ap==null ||ap.isEmpty()) {
				throw new NullPointerException("Enter input straing is null or empty");
			}
			StringBuilder n=new StringBuilder();
			for(char ch:ap.toCharArray()) {
				if(Character.isDigit(ch)) {
					n.append(ch);
				}
			}
			if(n.length()>0) {
				System.out.println("Extracted numeric chracters:"+n);
			}
			else
				System.out.println("No numeric charaters found");
		}
		catch(NullPointerException e) {
			System.out.println("Exception caught:"+e.getMessage());
		}
		
	}

}
