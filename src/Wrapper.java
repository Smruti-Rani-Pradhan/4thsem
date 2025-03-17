
public class Wrapper {

	public static void main(String[] args) {
		System.out.println((Integer.compare(10,20)));
		System.out.println((Integer.compare(30,20)));
		System.out.println((Integer.compare(10,10)));
		
		System.out.println((Double.compare(10.34,20.56)));
		System.out.println((Double.compare(30.7,20.3)));
		System.out.println((Double.compare(10.5,1.5)));
		
		System.out.println((Float.compare(10.8f,20.9f)));
		System.out.println((Float.compare(30.8f,20.8f)));
		System.out.println((Float.compare(10.5f,10.5f)));
		System.out.println((Character.compare('f','c')));


	}

}
