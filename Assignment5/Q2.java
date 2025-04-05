package Assignment5;
class MyText implements CharSequence{
	   private String data;
	   public MyText(String t) {
		   data=t;
	   }
		public int length() {
			return data.length();
		}
		public char charAt(int index) {
			return data.charAt(index);
		}

		public CharSequence subSequence(int start, int end) {
			return data.substring(start,end);
		}
		
		
	}

public class Q2 {

	public static void main(String[] args) {
		String s="hello";
		System.out.println("Original String:"+s);
		System.out.println("Memory Adress:"+System.identityHashCode(s));
		s=s.concat("world");
		System.out.println("After concat:"+s);
		System.out.println("New memory Adress:"+System.identityHashCode(s));
		CharSequence ch="Immutable";
		System.out.println("Using string as char sequence");
		System.out.println("ChRACTER AT index 2:"+ch.charAt(2));
		System.out.println("ChRACTER AT index 2:"+ch.length());
		System.out.println("ChRACTER AT index 2:"+ch.subSequence(2,6));
		System.out.println("Original charsequence:"+ch);
		
		
		

	}

}
