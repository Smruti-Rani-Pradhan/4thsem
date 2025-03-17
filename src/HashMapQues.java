import java.util.*;
import java.util.Objects;
class Student9
{
	String name;
	int id;
	public Student9(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null||getClass()!=getClass())
			return false;
		Student9 student=(Student9)obj;
		return id==student.id && name.equals(student.name);
	}
	public int hashCode() {
		return Objects.hash(name,id);
	}
}
public class HashMapQues
{
	public static void main(String[] args) 
	{
//		HashMap<Student9,String> map=new HashMap<>();
		Student9 s1=new Student9("Ram",5);
		Student9 s2=new Student9("Ram",5);
		//map.put(s1,"Topper");
		//System.out.println(map.get(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
	}
}
