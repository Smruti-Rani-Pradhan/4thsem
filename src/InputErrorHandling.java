import java.util.*;
public class InputErrorHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a no.");
			int n=sc.nextInt();
			System.out.println("num:"+n);
		}
		catch(Exception e){
			System.out.println("Invalid input!");
		}
//		finally {
//			sc.close();
//		}

	}

}
