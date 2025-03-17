import java.util.PriorityQueue;
import java.util.Collections;
public class MaxHPexmp {

	public static void main(String[] args) {
		int arr[]= {1,2,10,8,7,3,4,6,5,9};
		PriorityQueue<Integer> m =new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr) {
        	m.add(num);
        }
        System.out.println("Elements in sorted order");
        while(!m.isEmpty()) {
        	System.out.println(m.poll()+" ");
        }

	}

}
