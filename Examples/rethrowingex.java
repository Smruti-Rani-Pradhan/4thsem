package Examples;

public class rethrowingex {

	public static void main(String[] args) {
		try {
			methodA();
		}
		catch(Exception e){
			System.out.println("Caught in main:"+e.getMessage());
		}

	}
	public static void methodA()throws Exception{
		  try {
		 throw new Exception("Original Exception");
	  }catch(Exception e){
			  System.out.println("Exception caught in methodA:rethrowing...");
			  throw e;//rethrowing the same exception
		  }
	  }

}
