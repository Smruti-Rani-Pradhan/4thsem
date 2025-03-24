package Examples;

public class finalizegarbage {
	protected void finalize() throws Throwable{
		System.out.println("Finalize method called");
	}

	public static void main(String[] args) {
		new finalizegarbage();
		System.gc();
		System.out.println("Garbage collection requested");

	}

}
