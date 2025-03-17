import java.util.*;

	class Student6 implements Comparable<Student6>{
		int id;
		String name;
		int marks;
		public Student6(int i,String n,int m) {
			id=i;
			name=n;
			marks=m;
		}

		@Override
		public int compareTo(Student6 o) {
			return Integer.compare(this.id, o.id);
		}
		public String toString() {
			return id+" "+name+" "+marks;		
			}
		
	}
	public class ComparableInterface {
       public static void main(String[] args) {
		List<Student6> stu=new ArrayList<>();
		stu.add(new Student6(21,"Smruti",35));
		stu.add(new Student6(22,"smita",35));
		stu.add(new Student6(23,"shreya",35));
		Collections.sort(stu);
		System.out.println("Sorted students at Id:"+stu);
		

	}

}
