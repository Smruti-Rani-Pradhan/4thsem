package Assignment4;

public class Q3 {
 private String name;

	public Q3(String name) {
	this.name = name;
	System.out.println("Object Created:"+name);
}
	protected void finalize() throws Throwable {
        System.out.println("Garbage collection: Object with name " + name + " is being collected.");
    }

	public static void main(String[] args) {
		Q3 obj1=new Q3("object1");
		Q3 obj2=new Q3("object2");
//		obj1=obj2;
		obj2=null;
		System.gc();
		try {
            Thread.sleep(2000); // Sleeping for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
