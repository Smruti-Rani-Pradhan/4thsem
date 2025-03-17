class Parent{
	void show(){
		System.out.println("Parent show method");
	}
}
class Child extends Parent{
	void show(){
//		super.show();
		System.out.println("Child show method");
	}
}

public class Show {

	public static void main(String[] args) {
		Parent p=new Child();//upcasting
		p.show();
		Parent p1=new Parent();
		p1.show();
		Child obj=(Child)p;//downcasting,do when upcasting is done
		obj.show();

	}

}
