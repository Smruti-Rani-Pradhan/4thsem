package Examples;

public class finalizeex {
	protected void finalize() {
		System.out.println("Finalize method called");
	}

	public static void main(String[] args) {
		new finalizeex();
		System.gc();
		System.out.println("Garbage collection requested");

	}

}
