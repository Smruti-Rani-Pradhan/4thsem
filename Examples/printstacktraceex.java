package Examples;

public class printstacktraceex {

	public static void main(String[] args) {
		try {
			int r=10/0;
		}catch(ArithmeticException t) {
			t.printStackTrace();
		}

	}

}
