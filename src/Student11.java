import java.util.ArrayList;
import java.util.List;
public class Student11 {
	String name;
	int id;
	public Student11(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public boolean equals(Object obj) {
		if(this==obj)return true;
		if(obj==null || getClass()!=obj.getClass()) return false;
		Student11 s=(Student11)obj;
		return id==s.id && name.equals(s.name);
	}

	public static void main(String[] args) {
		List<Student11> s=new ArrayList<>();
	    s.add(new Student11("Amol",101));
	    System.out.println(s.contains(new Student11("Amol",101)));

	}

}
