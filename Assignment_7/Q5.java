package Assignment_7;
import java.util.function.Function;

public class Q5 {

	 public static Function<Integer,Integer> getSquareFunction(){
		 return x->x*x;
	 }
	 public static void main(String[] args) {
     Function<Integer,Integer> s=getSquareFunction();
     System.out.println("Square of 4:"+s.apply(4));
     System.out.println("Square of 6:"+s.apply(6));
     System.out.println("Square of 10:"+s.apply(10));
	}

}
