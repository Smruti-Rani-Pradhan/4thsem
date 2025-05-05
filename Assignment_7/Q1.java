package Assignment_7;
interface StringProcessor{
	int process(String input);
}
public class Q1 {

	public static void main(String[] args) {
		StringProcessor l=(str)->str.length();
		String t="Hello,Functional interface!";
		int length=l.process(t);
		System.out.println("Length of the String is:"+length);

	}

}
