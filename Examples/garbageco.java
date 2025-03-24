package Examples;

public class garbageco {
	public static void main(String[] args) {
	String s1=new String("Hello");
	s1=null;
	Person1 p1=new Person1("John");
	Person1 p2=new Person1("Doe");
	p1=p2;
	
	}
}
class Person1{
	String name;
	Person1(String name){
		this.name=name;
	}
}
