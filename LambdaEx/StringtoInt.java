package LambdaEx;

import java.util.function.Function;

public class StringtoInt {

	public static void main(String[] args) {
		Function<String,Integer> st= (String s)-> Integer.parseInt( s);//can aslo write s instead of String s
		int r=st.apply("124");
		System.out.println("converted int:"+r);

	}

}
