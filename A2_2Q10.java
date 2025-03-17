import java.util.*;
public class A2_2Q10 {
	public static int SmallestMissing(int arr[]){
		HashMap<Integer,Integer> n=new HashMap<>();
		for(int num:arr) {
			n.put(num,1);
		}
		
		for(int i=1;i<=10;i++) {
			if(!n.containsKey(i)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
int n1 []= {3,7,1,2,8,4,5,10,9,12};
	int mis=SmallestMissing(n1);
	System.out.println("Missing no. is "+mis);

}

}
