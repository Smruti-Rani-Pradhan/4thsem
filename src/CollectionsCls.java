import java.util.*;
public class CollectionsCls {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<>(Arrays.asList(5,1,4,3,2));
		Collections.sort(num);
		System.out.println("Sorted numbers:"+num);

	}

}
