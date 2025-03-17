import java.util.*;
public class CollectionsMethod {

	public static void main(String[] args) {
		Collection<String> n=new ArrayList<>();
		n.add("Apple");
		n.add("Ram");
		n.add("Ritu");
		n.add("shyam");
		System.out.println("Collections:"+n);
		System.out.println("Contains Apple:"+n.contains("Apple"));
		System.out.println("Size:"+n.size());
		System.out.println("Remove:"+n.remove("Ritu"));
		System.out.println("Updated List:"+n);
		System.out.println(n.isEmpty());
		
		

	}

}
