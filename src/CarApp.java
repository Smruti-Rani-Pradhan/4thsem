import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car1 implements Comparable<Car1>{
	   int modelNo;
		String name;
		int stock;
		public Car1(int m,String n,int s) {
			modelNo=m;
			name=n;
			stock=s;
		}
		public int compareTo(Car1 o) {
			return Integer.compare(this.stock, o.stock);
		}
		public String toString() {
			return modelNo+" "+name+" "+stock;		
			}
		
	}
public class CarApp {

	public static void main(String[] args) {
		List<Car1> c=new ArrayList<>();
		c.add(new Car1(2013,"Creta",30));
		c.add(new Car1(2020,"MG",13));
		c.add(new Car1(2018,"Kia",20));
		Collections.sort(c);
		System.out.println("Sorted cars at stock:"+c);
		c.add(new Car1(2017,"Audi",45));
		System.out.println("Updated cars students at stock:"+c);
		Collections.sort(c);
	

	}

}
