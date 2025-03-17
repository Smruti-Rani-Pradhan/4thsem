
public class Q2 {
	
	public static int valuex() {
		int x=20;
		return x;
	}
	public static int valuey() {
		int y=30;
		return y;
	}
	
	public static int valuex(int x) {
		
		return x;
	}
	public static int valuey(int y) {
		
		return y;
	}

	public static void main(String[] args) {

//	Q1 ques=new Q1();
//	System.out.println(ques.s);//through object
		int res1=valuex();
		System.out.println(res1);
		int res2=valuey();
		System.out.println(res2);
		int res3=valuex(50);
		System.out.println(res3);
		int res4=valuey(60);
		System.out.println(res4);
		

	}

}
