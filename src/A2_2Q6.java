import java.util.*;

public class A2_2Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> n=new TreeSet<>();
		n.add(10);
		n.add(25);
		n.add(5);
		n.add(30);
		//display
	System.out.println("Tree set Elements:"+n);
	//if number exists or not
	System.out.println("Enter a number to search:");
	int search=sc.nextInt();
	if(n.contains(search)) {
		System.out.println(search+"is present ");
	}
	else
		System.out.println(search+"is not present ");
	
	System.out.println("Enter a number to remove");
	int rn=sc.nextInt();
	if(n.remove(rn)) {
		System.out.println(rn+"removed");
	}
	else
		System.out.println(rn+"not removed");
	System.out.println("Updated Tree set Elements:"+n);
	}
	

}
