package Examples;

public class throwsexample {
  public static void checkAge(int age)throws Exception{
	  try {
	  if(age<18) {
			throw new IllegalArgumentException("Not eligible for voting");
		}
		System.out.println("Eligible for voting");
  }
	  catch(Exception e){
		  System.out.println("Exception caught:"+e.getMessage());
	  }
  }
  public static void main(String[] args) throws Exception {
	 
		  checkAge(15);
	 
  }
}
