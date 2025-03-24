package Examples;

public class throwex {

	public static void main(String[] args) {
		int age=20;
		if(age<18) {
			throw new IllegalArgumentException("age must be greater than 18");
		}
		System.out.println("Access granted");

	}

}
