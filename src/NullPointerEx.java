
public class NullPointerEx {

	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println("RESULT:"+str.length());
		}
		catch(Exception e) {
			System.out.println("Null value encountered"+e);
		}
		finally {
			System.out.println("Change the value");
		}

	}

}
