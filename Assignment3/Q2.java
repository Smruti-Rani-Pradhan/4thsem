package Assignment3;
class CustomNullPointerException extends RuntimeException{
	public CustomNullPointerException(String m) {
		super(m);
	}
}
public class Q2 {
	public static void checkNull(String str) {
		if(str==null) {
			throw new CustomNullPointerException("Custom Null pointer Exception");
		}
		System.out.println("String is valid:"+str);
	}


    public static void main(String[] args) {
		try {
			String t=null;
			checkNull(t);
		}
		catch(CustomNullPointerException e) {
			System.out.println("Exception caught:"+e.getMessage());
		}

	}

}
