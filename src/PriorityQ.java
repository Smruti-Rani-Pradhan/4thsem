import java.util.PriorityQueue;
public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue<Integer> m =new PriorityQueue<>();
		m.add(10);
		m.add(5);
		m.add(20);
		m.add(1);
		System.out.println(m.peek());//1 smallest element
		m.poll();//remove root
		System.out.println(m.peek());

	}

}
