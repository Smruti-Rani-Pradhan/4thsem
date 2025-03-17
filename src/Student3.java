import java.util.*;

	class Student4 implements Comparable<Student4>{
		private String name;
		private int rollNumber;
		private double totalMark;
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRollNumber() {
			return rollNumber;
		}

		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}

		public double getTotalMark() {
			return totalMark;
		}

		public void setTotalMark(double totalMark) {
			this.totalMark = totalMark;
		}
		
		public Student4(String n,int r,double m) {
			name=n;
			rollNumber=r;
			totalMark=m;
		}

		public int compareTo(Student4 o) {
			
			return Double.compare(this.totalMark, o.totalMark);
		}
		public String toString() {
	        return "Name: " + name+ ", Rollno: " + rollNumber + ", Mark: " + totalMark ;
	    }
	}
 public class Student3 {
	 public static Student4 search(Student4[] students,int rollNumber) {
		 for(Student4 stu:students) {
			 if(stu.getRollNumber()==rollNumber) {
				 return stu;
			 }
		 }
		 return null;
	 }
	public static void main(String[] args) {
		Student4[] stu1= {
			new Student4("Smruti",1,95.5)	,
			new Student4("Smita",2,85.5)	,
			new Student4("Shreya",3,80.5)	
		};
		System.out.println("Student sorted by marks:");
		java.util.Arrays.sort(stu1);
		for(Student4 st:stu1) {
			System.out.println(st.toString());
		}
		int target=3;
		Student4 st=search(stu1,target);
        if(st!=null) {
        	System.out.println("Student found: "+st);
        }
        else
        	System.out.println("Student not found");
	}

}
