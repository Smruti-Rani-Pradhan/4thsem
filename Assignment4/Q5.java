package Assignment4;

public class Q5 {
  private int iv;
  private double dv;
  
  public Q5(int iv, double dv) {
	this.iv = iv;
	this.dv = dv;
	System.out.println("Object Created:"+this);
}
  public void UpdateValues(int ni,double nd) {
	  this.iv=ni;
	  this.dv=nd;
	  
  }
  protected void finalize() throws Throwable {
      System.out.println("Garbage collection: Object with name " + dv+ " is being collected.");
  }

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("total Memory:"+r.totalMemory()/1024+"KB");
		System.out.println("free Memory:"+r.freeMemory()/1024+"KB");
		System.out.println("Max Memory:"+r.maxMemory()/1024+"KB");
		Q5 obj1=new Q5(10,20.5);
		Q5 obj2=new Q5(30,50.5);
		obj1.UpdateValues(15, 25.5);
		obj1.UpdateValues(35, 45.5);
		System.out.println("Memory after object Creation");
		System.out.println("total Memory:"+r.totalMemory()/1024+"KB");
		System.out.println("free Memory:"+r.freeMemory()/1024+"KB");
		System.out.println("Max Memory:"+r.maxMemory()/1024+"KB");
		obj1=null;
		obj2=null;
		System.gc();
		try {
            Thread.sleep(2000); // Sleeping for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Memory after garbage Creation");
		System.out.println("total Memory:"+r.totalMemory()/1024+"KB");
		System.out.println("free Memory:"+r.freeMemory()/1024+"KB");
		System.out.println("Max Memory:"+r.maxMemory()/1024+"KB");
		
		
		

	}

}
