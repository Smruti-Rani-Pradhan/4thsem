class Student1{
	private String name;
	public Student1(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class Course{
	private String coursename;
	public Course(String coursename) {
		this.coursename=coursename;
	}
	public void enrollStudent1(Student1 Student1) {
		System.out.println(Student1.getName()+" has enrolled in "+coursename);
	}
	
}
public class Association {

	public static void main(String[] args) {
		Student1 st=new Student1("Smruti");
		Course c=new Course("java");
		c.enrollStudent1(st);

	}

}
