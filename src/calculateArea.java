class Area{
 static double area;
	void Area(int l,int b){
	 area=l*b;
	 System.out.println("Area="+area);
	 
	}
	void Area(int s){
	 area=s*s;
	 System.out.println("Area="+area);
	}
	void Area(double base,double height){
	 area=1/2*base*height;
	 System.out.println("Area="+area);
   }
//	static void display() {
//		System.out.println("Area="+area);
//	}
}
public class calculateArea {

	public static void main(String[] args) {
		Area a=new Area();
		a.Area(5, 7);
		a.Area(6);
		a.Area(10.0,20.0);
//		Area a1=new Area(7);
//		Area a2=new Area(60.0,70.0)
		

	}

}
