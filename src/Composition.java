class battery{
	private String name;
	public battery(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class Laptop{
	private String brand;
	private battery Battery;
	public Laptop(String brand,String BatteryType) {
		this.brand=brand;
		this.Battery=new battery(BatteryType);
	}
	
	public void display() {
	 System.out.println("Laptop brand :"+brand);
	 System.out.println("Battery type:"+Battery.getName());
	 
	}
	
}

public class Composition {

	public static void main(String[] args) {
		Laptop l=new Laptop("Hp","fghtr");
		l.display();
		

	}

}


