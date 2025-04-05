package Assignment5;

public class Q1 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println("Memory Address(s1):"+System.identityHashCode(s1));
		System.out.println("Memory Address(s2):"+System.identityHashCode(s2));
		System.out.println("Memory Address(s3):"+System.identityHashCode(s3));
		System.out.println("Memory Address(s4):"+System.identityHashCode(s4));
		System.out.println("Using == for comparison:");
		System.out.println("s1 == s2:"+(s1 == s2));
		System.out.println("s1 == s3:"+(s1 == s3));
		System.out.println("s3 == s4:"+(s3 == s4));
		System.out.println("Using equals() for comparison:");
		System.out.println("s1.equals(s3):"+s1.equals(s3));
		System.out.println("s3.equals(s4):"+s3.equals(s4));
		String s5=s3.intern();
		System.out.println("After interning s3:");
		System.out.println("s1==s5:"+(s1==s5));
		}

}

