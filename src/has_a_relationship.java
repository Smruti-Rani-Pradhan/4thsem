class Engine{
	private String type;
	public Engine(String type) {
      this.type=type;		
	}
	public String getType() {
		return type;
	}
}
class Car{
	private String brand;
	private Engine engine;//car has an engine
	public Car(String brand,Engine engine){
		this.brand=brand;
		this.engine=engine;
	}
	public void display() {
		System.out.println("Car brand:"+brand);
		System.out.println("Engine type:"+engine.getType());
	}
}
public class has_a_relationship {

	public static void main(String[] args) {
		Engine e=new Engine("V8");
		Car c=new Car("BMW",e);
		c.display();
	}

}
