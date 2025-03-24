package Examples;

public class NestedTryCatch {

	public static void main(String[] args) {
		try {
			int[] n= {10,20,30};
			int index=5;
			try {
				int r=n[index]/0;
				System.out.println("Resukt:"+r);
				}
			catch(ArithmeticException e) {
				System.out.println("Inner Catch:Divison by zero not allowed!");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer catch is out of bounds");
			
		}

	}

}
