import java.util.*;
class Student7{
	int id;
	String name;
	int marks;
	public Student7(int i,String n,int m) {
		id=i;
		name=n;
		marks=m;
	}
	public String toString() {
		return id+" "+name+" "+marks;		
		}
}
	class marks implements Comparator<Student7>{
		public int compare(Student7 s1,Student7 s2) {
			return Integer.compare(s1.marks, s2.marks);
		}
	}
	class name implements Comparator<Student7>{
		public int compare(Student7 s1,Student7 s2) {
			return s1.name.compareTo(s2.name);
		}
	}

public class ComparatorInterface {

	public static void main(String[] args) {
		List<Student7> stu=new ArrayList<>();
		stu.add(new Student7(21,"Smruti",95));
		stu.add(new Student7(22,"smita",90));
		stu.add(new Student7(23,"shreya",80));
		Collections.sort(stu,new marks());
		System.out.println("Sorted marks:"+stu);
		Collections.sort(stu,new name());
		System.out.println("Sorted marks:"+stu);
	}

}
