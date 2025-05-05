package LambdaEx;
import java.util.*;
import java.util.function.BiFunction;
public class lambdaexmp {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> p=(x,y)->x+y;
		int r=p.apply(20,20);
		System.out.println("sum is="+r);

	}

}
