package Assignment5;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer("Apple");
		System.out.println("1.Append:");
		System.out.println("2.Insert:");
		System.out.println("3.Delete:");
		System.out.println("4.Reverse:");
		System.out.println("5.Replace at a specified index:");
		System.out.println("6.exit");
		System.out.println("Enter your choice:");
		int c=sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("enter the text to append:");
			String t=sc.nextLine();
			s.append(t);
			break;
		case 2:
//			System.out.println("Insert a text:");
			System.out.println(s.insert(0, "Banana"));
			break;
		case 3:
			System.out.println(s.delete(0,3));
			break;
		case 4:
			System.out.println(s.reverse());
			break;
		case 5:
			System.out.println(s.replace(1,3,"Smruti"));
			break;
		case 6:
			System.out.println("exit");
			sc.close();
			break;	
			default:
				System.out.println("invalid choice");
			
		}
		

	}

}
