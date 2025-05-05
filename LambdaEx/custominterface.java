package LambdaEx;
interface FuncInterface{
	void abstractFun(int x);
	default void normalFun() {
		System.out.println("Hello");
	}
}
public class custominterface {

	public static void main(String[] args) {
		FuncInterface f=(int x)->System.out.println("Double="+2*x);
		f.abstractFun(5);
		f.normalFun();

	}

}
