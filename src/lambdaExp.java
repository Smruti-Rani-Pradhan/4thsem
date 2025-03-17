import java.util.*;

class Student8{
	int id;
	String name;
	int marks;
	public Student8(int i,String n,int m) {
		id=i;
		name=n;
		marks=m;
	}
	public String toString() {
		return id+" "+name+" "+marks;		
		}
}

public class lambdaExp {

	public static void main(String[] args) {
		List<Student8> stu=new ArrayList<>();
		stu.add(new Student8(21,"smruti",95));
		stu.add(new Student8(22,"smita",90));
		stu.add(new Student8(23,"shreya",80));
		stu.sort((s1,s2)->Integer.compare(s1.marks, s2.marks));
		Collections.reverse(stu);
		System.out.println("Sorted by marks:"+stu);
		stu.sort(Comparator.comparing(s -> s.name));
		Collections.reverse(stu);
		System.out.println("Sorted by name:"+stu);

	}

}
