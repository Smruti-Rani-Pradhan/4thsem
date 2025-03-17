
import java.util.*;
public class A2_2Q9 {

	public static void main(String[] args) {
		int[] num= {4,7,2,8,4,9,2,1,8,3}; 
		HashSet<Integer>seenNumbers=new HashSet<>();
		HashSet<Integer>repeatedNumbers=new HashSet<>();
		for(int n:num) {
			if(!seenNumbers.add(n)) {
				repeatedNumbers.add(n);
			}
		}
		System.out.println("Repeating Numbers:"+repeatedNumbers);
	}

}
