class Apple{
 String color;
	Apple(String color){
		this.color=color;	}
}
class Taste1 extends Apple{
	 String taste;

	Taste1(String taste,String color){
		super(color);
		this.taste=taste;	
		}
}
class KashmiriApple extends Taste1{
	 String size;

	public KashmiriApple(String size,String taste,String color){
		super(taste,color);
		this.size=size;	
		}
	void display() {
		System.out.println("Color:"+color);
		System.out.println("taste:"+taste);
		System.out.println("Size:"+size);
		
	}
}

public class fruit {

	public static void main(String[] args) {
//		Apple a=new Apple("red");
//		Taste1 t=new Taste1("sour");
		KashmiriApple k=new KashmiriApple("big","sour","blue");
		k.display();
		

	}

}
