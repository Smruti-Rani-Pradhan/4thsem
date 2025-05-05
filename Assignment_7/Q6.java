package Assignment_7;

import java.util.function.Function;

public class Q6 {
	
	public static Function<Integer,Integer> getFactorialFunction(){
		 return (n)->{
			 int fact=1;
			 for(int i=1;i<=n;i++) {
				 fact=fact*i;
			 }
			 return fact;
		 };
	 }
	public static void main(String[] args) {
		Function<Integer,Integer> s=getFactorialFunction();
		System.out.println("Factorial of 4:"+s.apply(4));

	}

}
