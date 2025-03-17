class Student2{
	String name;
	int age;
	int rollno;
	Student2(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public Student2(String name, int age, int rollno) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
public class getersetter {

	public static void main(String[] args) {
		Student2 s=new Student2("Smruti",19,52);
	System.out.println(s.getName());
	System.out.println(s.getAge());
	System.out.println(s.getRollno());
	Student2 p=new Student2();
	p.setName("Ritu");
	p.setAge(19);
	p.setRollno(56);
	System.out.println(p.getName());
	System.out.println(p.getAge());
	System.out.println(p.getRollno());
	

	}

}
