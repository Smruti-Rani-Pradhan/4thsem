class Test5{
	static String clgname;
	static int regdno;
	Test5(String clg,int regd){
		 clgname=clg;
		 regdno=regd;
	}
	void display() {
		
		System.out.println(clgname+" "+regdno);
	}
	
}
public class student {

	public static void main(String[] args) {
		Test5 t=new Test5("iter",234101);
		t.display();
		Test5 t1=new Test5("kiit",234101);
		t1.display();
		Test5 t2=new Test5("silicon",234101);
		t2.display();
		

	}

}
