package Assignment4;

import java.lang.ref.Cleaner;

public class Q1CleanerAPI {

    private String name;
    private static final Cleaner cleaner = Cleaner.create();
    private final Cleaner.Cleanable cleanable;

    public Q1CleanerAPI(String name) {
        this.name = name;
        System.out.println("Object created: " + this.name);
        this.cleanable = cleaner.register(this, new CleanupAction(name));
    }
     public void show() {
        
        display("First Object");
    }

    public void display(String objectName) {
        Q1CleanerAPI obj2 = new Q1CleanerAPI(objectName);
    }
    private static class CleanupAction implements Runnable {
        private final String name;

        CleanupAction(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Garbage collection: Object with name " + name + " is being collected.");
        }
    }

    public static void main(String[] args) {
        Q1CleanerAPI obj = new Q1CleanerAPI("Main Object");
        obj.show();
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}