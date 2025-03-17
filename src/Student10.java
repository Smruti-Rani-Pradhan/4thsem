import java.util.*;
public class Student10 {
	String name;
	int id;
	public Student10(String name,int id) {
		this.name=name;
		this.id=id;
	}

	public static void main(String[] args) {
		List<Student10> s=new ArrayList<>();
	    s.add(new Student10("Amol",101));
	    System.out.println(s.contains(new Student10("Amol",101)));

	}

}
