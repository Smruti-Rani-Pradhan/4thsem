package LambdaEx;
import java.util.function.Consumer;
public class Method_reference {
	public static void printMessage(String m) {
		System.out.println("Message:"+m);
	}

	public static void main(String[] args) {
		//using lambda
		Consumer<String> l=msg->printMessage(msg); 
		l.accept("Hello using lambda");
		//using method reference(cleaner.)
		Consumer<String> c=Method_reference::printMessage;
		c.accept("Hello using method referrence");

	}

}
