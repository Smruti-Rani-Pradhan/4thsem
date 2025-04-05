package Assignment5;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder s=new StringBuilder("Hello Java");
		System.out.println("1.Add:");
		System.out.println("2.Remove:");
		System.out.println("3.Modify at specify index:");
		System.out.println("4.Concat:");
		System.out.println("5.exit");
		System.out.println("Enter your choice:");
		int c=sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("enter the index to append:");
		    int st=sc.nextInt();
			int en=sc.nextInt();
//			s.append(t);
			String sub=s.substring(st, en);
			System.out.println(s.insert(3,sub)); 
			break;
		case 2:
			System.out.println(s.delete(0,3));
			break;
		case 3:
			System.out.println(s.replace(1,2,"Smruti"));
			break;
		case 4:
			System.out.println(s.toString().concat("Banana"));
			break;
	
		case 5:
			System.out.println("exit");
			sc.close();
			break;	
			default:
				System.out.println("invalid choice");
			
		}
		

	}

}
