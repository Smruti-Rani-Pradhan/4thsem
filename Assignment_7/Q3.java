package Assignment_7;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("Java");
		s.add("Functional");
		s.add("Lambda");
		s.add("Stream");
		s.add("API");
		s.sort((s1,s2)->Integer.compare(s2.length(), s1.length()));
		System.out.println("String sorted by length:"+s);
		

	}

}
