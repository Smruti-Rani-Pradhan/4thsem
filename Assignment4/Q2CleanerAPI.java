package Assignment4;

import java.lang.ref.Cleaner;

public class Q2CleanerAPI {
    private String name;
    private static final Cleaner cleaner = Cleaner.create();
    private final Cleaner.Cleanable cleanable;

    public Q2CleanerAPI(String name) {
        this.name = name;
        System.out.println("Object Created: " + name);
        this.cleanable = cleaner.register(this, new CleanupAction(name));
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
        Q2CleanerAPI obj1 = new Q2CleanerAPI("object1");
        Q2CleanerAPI obj2 = new Q2CleanerAPI("object2");
        obj1 = obj2;
//        obj2 = null;
            System.gc();
        try {
            Thread.sleep(2000); // Sleeping for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
