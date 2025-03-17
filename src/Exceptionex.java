
public class Exceptionex {

	public static void main(String[] args) {
		try {
			int a=10,b=0;
			int result=a/b;
			System.out.println("RESULT:"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator can't be 0"+e);
		}
		finally {
			System.out.println("Change the denominator");
		}

	}

}
