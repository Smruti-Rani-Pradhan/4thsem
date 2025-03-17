class Test4{
	static int c=0;
	Test4(){
		
		c++;
	}
	
}
public class checkobj {

	public static void main(String[] args) {
		Test4 t=new Test4();
		Test4 t1=new Test4();
		Test4 t2=new Test4();
		Test4 t3=new Test4();
		System.out.println(t3.c);
		
		

	}

}
