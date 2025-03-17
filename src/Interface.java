interface Flyable{
	void fly();
}
interface Swimmable{
	void swim();
}
class Bird implements Flyable,Swimmable{
	public void fly() {
		System.out.println("Bird can fly");
	}
	public void swim() {
		System.out.println("Bird can swim");
	}
}
public class Interface {

	public static void main(String[] args) {
		Bird b=new Bird();
		b.fly();
		b.swim();

	}

}
