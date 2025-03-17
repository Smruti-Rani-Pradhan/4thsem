
 class Test {
	static int x;
	Test() //using constructor
	{
	 x=70;
	}
	Test(int n) //using parameter constructor
	{
	 x=n;
	}
}
	
	public class Q3{
		public static void main(String[] args) {
			Test QUES=new Test();
			System.out.println(QUES.x);
			Test QUES1=new Test(50);
			System.out.println(QUES1.x);

		}
	}

	


