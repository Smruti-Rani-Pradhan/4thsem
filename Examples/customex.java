package Examples;
class CustomException extends RuntimeException{
	public CustomException(String m) {
		super(m);
	}
}
 public class customex{
    public static void main(String[] args) {
		try {
			throw new CustomException("Custom error occured");
		}
		catch(CustomException e) {
			System.out.println("Exception caught:"+e.getMessage());
		}

	}

 }
