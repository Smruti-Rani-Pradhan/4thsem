package Assignment_7;
interface Shape{
	double area();
	default void Printarea() {
		System.out.println("Area:"+area());
	}
	
}
public class Q4 {

	public static void main(String[] args) {
		double a=3.0;
		double b=4.0;
		Shape r=()->a*b;
		System.out.println("Area of rectangle:"+r.area());
		Shape c=()->Math.PI*a*a;
		c.Printarea();
		Shape s=()->a*a;
		s.Printarea();
		
       
	}

}
