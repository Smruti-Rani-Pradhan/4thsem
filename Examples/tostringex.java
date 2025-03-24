package Examples;

public class tostringex {

	public static void main(String[] args) {
		try {
			int r=10/0;
		}catch(ArithmeticException t) {
			System.out.println("Error:"+t.toString());
		}

	}

}
