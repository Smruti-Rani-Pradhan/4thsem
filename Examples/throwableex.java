package Examples;

public class throwableex {

	public static void main(String[] args) {
		try {
			int r=10/0;
		}catch(Throwable t) {
			System.out.println("Caught throwable:"+t);
		}

	}

}
