class Animal{
	String name;
	public Animal(String name) {
		this.name=name;
	}
	public void Sound() {
		System.out.println("Some generic animal sound");
	}
}
class Dog extends Animal{
	public Dog(String name) {
		super(name);	
		}
	public void sound() {
		System.out.println("Bark");
	}
}
class Cat extends Animal{
	public Cat(String name) {
		super(name);	
		}
	public void sound() {
		System.out.println("Meow");
	}
}

public class is_a_relationship {

	public static void main(String[] args) {
		Dog d=new Dog("monty");
		Cat c=new Cat("kitty");
		System.out.println(d.name+" makes this sound:");
		d.sound();
		System.out.println(c.name+" makes this sound:");
		c.sound();
		

	}

}
