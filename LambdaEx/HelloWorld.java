package LambdaEx;
interface Myprinter{
	void print(String m);
}
public class HelloWorld {

	public static void main(String[] args) {
		Myprinter p= (m)->System.out.println("Message="+m);
		p.print("Hello world!");

	}

}
