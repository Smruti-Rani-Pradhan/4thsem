package Assignment_7;
interface Calculator{
	double operate(double a,double b);
}
public class Q2 {

	public static void main(String[] args) {
		Calculator add=(a,b)->a+b;
		Calculator sub=(a,b)->a-b;
		Calculator mult=(a,b)->a*b;
		Calculator div=(a,b)->{
			if(b==0) {
				System.out.println("Can't divide by zero");
				return 0;
			}
			return a/b;
		};
		double x=10;
		double y=2;
		System.out.println("Addition:"+add.operate(x, y));
		System.out.println("Subtraction:"+sub.operate(x, y));
		System.out.println("Multiplication:"+mult.operate(x, y));
		System.out.println("Division:"+div.operate(x, y));
		

	}

}
