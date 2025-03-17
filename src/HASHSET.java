import java.util.*;
 public class HASHSET {

	public static void main(String[] args) {
		Set<Integer> n=new HashSet<>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		System.out.println("HashSet:"+n);
		System.out.println("Contains 10 is:"+n.contains(10));
		System.out.println("Contains 30 is:"+n.contains(30));
		System.out.println("Contains 50 is:"+n.contains(50));

	}

}
