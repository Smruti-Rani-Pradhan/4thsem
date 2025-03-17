
class checkans {
    int x;
	int y;
//	checkans(){
//		System.out.println("Default constructor");
//	}
//	checkans(int n){
//		System.out.println(n+" is a parameter constructor");
//	}
	static checkans add(checkans t,checkans t1) {
	  	checkans t3=new checkans();
		t3.x=t.x+t1.x;
	  	t3.y=t.y+t1.y;
	  	
	  return t3;	
	}
	
 }
	
 public class Test2{
	public static void main(String[] args) {
		checkans t=new checkans();
		t.x=10;
		t.y=20;
		checkans t1=new checkans();
		t1.x=30;
		t1.y=40;
		checkans t3=new checkans();
		t3=t3.add(t,t1);
		System.out.println(t3);
		
	}
 }
 

