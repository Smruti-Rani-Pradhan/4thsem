
import java.util.*;
public class Word_Frequency 
{
	public static void main(String[] args)
	{
		String[] words= {"apple","banana","apple","orange","apple","banana"};
		Map<String,Integer> wc=new HashMap<>();
		for(String w:words)
			wc.put(w,wc.getOrDefault(w,0)+1);
		System.out.println(wc);
	}
}
