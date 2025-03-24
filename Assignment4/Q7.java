package Assignment4;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
class Student {
	private String name;
	private int studentID;
	private List<String>courses;
	public Student(String name,int studentID) {
		this.name=name;
		this.studentID=studentID;
		this.courses=new ArrayList<>();
		System.out.println("Student enrolled: "+name+"(ID: "+studentID+")");
	}
	public void enrollCourse(String course) {
		courses.add(course);
		System.out.println(name+" enrolled in:"+course);
	}
	public void displayInfo() {
		System.out.println("Student name:"+name);
		System.out.println("Student ID:"+studentID);
		System.out.println("Enrolled courses:"+courses);
	}
	protected void finalize()throws Throwable{
		System.out.println("Garbage Collected:Student"+name+"(ID: "+studentID+")");
	}
}
public class Q7{
	public static void main(String[] args) {
		Runtime runtime=Runtime.getRuntime();
		SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
		printMemoryUsage(runtime,sdf,"Before Enrollment");
		List<Student>students=new ArrayList<>();
		for(int i=1;i<=3;i++) {
			Student stud=new Student("Student"+i,1000+i);
			stud.enrollCourse("Course A");
			stud.enrollCourse("Course B");
			students.add(stud);
		}
		for(Student stud:students) {
			stud.displayInfo();
		}
		printMemoryUsage(runtime,sdf,"After Enrollment");
		students.clear();
		System.gc();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		 printMemoryUsage(runtime,sdf,"After garbage collection");
	        System.out.println("End of program");
	}

	private static void printMemoryUsage(Runtime runtime, SimpleDateFormat sdf, String label) {
		String t=sdf.format(new Date());
		long totalMemory=runtime.totalMemory()/1024/1024;
		long freeMemory=runtime.freeMemory()/1024/1024;
		long usedMemory=totalMemory-freeMemory;
		System.out.printf("[%s]%s-Total Heap:%d MB| used Heap:%d MB %n"
				,t,label,totalMemory,freeMemory,usedMemory);
	}

}
