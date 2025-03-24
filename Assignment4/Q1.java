package Assignment4;
public class Q1 {

    private String name;
    public Q1(String name) {
        this.name = name;
        System.out.println("Object created: " + this.name);
    }

    public void show() {
        Q1 obj1 = new Q1("First Object");
         // Invoking the display() method which will create another instance
        display();
    }
    public void display() {
        Q1 obj2 = new Q1("Second Object");
    }

    protected void finalize() {
        System.out.println("Garbage collection: Object with name " + name + " is being collected.");
    }

    public static void main(String[] args) {
        Q1 obj = new Q1("Main Object");
        obj.show();
        System.gc();
        try {
            Thread.sleep(2000); // Sleeping for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
