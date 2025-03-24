package Examples;

public class Systemerrex {

	public static void main(String[] args) {
		try {
			int r=10/0;
		}catch(ArithmeticException t) {
			System.err.println("Error:"+t.toString());
			System.err.println("Error:"+t.getMessage());
		}

	}

}
