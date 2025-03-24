package Assignment4;

public class Q4 {
 private String name;

	public Q4(String name) {
	this.name = name;
	System.out.println("Object Created:"+name);
}
	protected void finalize() throws Throwable {
        System.out.println("Garbage collection: Object with name " + name + " is being collected.");
    }

	public static void main(String[] args) {
		new Q4("object1");
		System.gc();
		try {
            Thread.sleep(2000); // Sleeping for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
