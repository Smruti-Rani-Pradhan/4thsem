class Student5 implements Comparable<Student5>{
		private String name;
		private int rollNumber;
		private double totalMark;
//		public int length;
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
		
		public Student5(String n,int r,double m) {
			name=n;
			rollNumber=r;
			totalMark=m;
		}

		public int compareTo(Student5 o) {
			
			return Double.compare(this.rollNumber, o.rollNumber);
		}
		public String toString() {
	        return "Name: " + name+ ", Rollno: " + rollNumber + ", Mark: " + totalMark ;
	    }
	}
 public class A2Q5 {
	 public static void bubblesort(Student5 [] stu) {
		 Student5 temp;
		 for(int i=0;i<stu.length;i++) {
			 for(int j=0;j<stu.length-1;j++) {
				if(stu[j].compareTo(stu[j+1])>0) {
					temp=stu[j];
					stu[j]=stu[j+1];
					stu[j+1]=temp;
				}
			 }
		 }
		 System.out.println("\nStudent sorted by roll numbers:");
		 for(int i=0;i<stu.length;i++) 
				System.out.println(stu[i]);
			
	 }
	public static void main(String[] args) {
		Student5[] stu1= {
			new Student5("Smruti",5,95.5)	,
			new Student5("Smita",2,85.5)	,
			new Student5("Shreya",3,80.5)	
		};
		System.out.println("before sorting");
		for(Student5 stu:stu1) {
			System.out.println(stu);
		}
	    bubblesort(stu1);
//		for(int i=0;i<stu1.length;i++) {
//			System.out.println(stu1[i]);
//		}
//		
	
		
	}

}
