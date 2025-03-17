abstract class Vehicle{
	abstract void Start();
	void stop() {
		System.out.println("Vehicle stopped");
	}
}
class CarA extends Vehicle{
	void Start() {
		System.out.println("CAR is Starting");
	}
}
public class Abstract {

	public static void main(String[] args) {
		Vehicle v=new CarA();
		v.Start();
		v.stop();
	}

}
