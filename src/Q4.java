
 class Test3 {
	 static int x=10;
	 int y= 20;
	 static void checkmethod() {
		
		System.out.println(x);
	}
	
	void checknon() {
		System.out.println(y);
	}
}
	
	public class Q4{
	public static void main(String[] args) {
		
		Test3.checkmethod();
		Test3 t=new Test3();
		t.checknon();
		
	}

}
