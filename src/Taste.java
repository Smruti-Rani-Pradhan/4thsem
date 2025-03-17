class biriyani{
	biriyani(){
		System.out.println("You can enjoy biriyani!");
	}
	
}
class chickenbiriyani extends biriyani{
	chickenbiriyani(){
		super();
		System.out.println("You can enjoy chickenbiriyani now!");
		
	}
}
public class Taste {

	public static void main(String[] args) {
		chickenbiriyani c=new chickenbiriyani();
	}

}
