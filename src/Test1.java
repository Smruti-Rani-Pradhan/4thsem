
 class Check {
	static int x=10;
	int y=40;
	Check(){
		System.out.println("Default constructor");
	}
	Check(int n){
		System.out.println(n+" is a parameter constructor");
	}
	
	static void function() {
		System.out.println("Static function");
	}
	 void nonstatic() {
		System.out.println("NonStatic function");
	}
	
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("NonStatic block");
	}
 }
 public class Test1{
	public static void main(String[] args) {
//		Check t=new Check();
//		System.out.println(Check.x);
		Check t1=new Check();
//		System.out.println(t1.y);
		t1.x=10;
		Check t2=new Check();
		t2.x=t2.x*2;
		System.out.println(t1.x);
		
		
		
		
		
	}
 }

