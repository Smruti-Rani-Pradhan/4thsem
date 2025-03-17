import java.util.*;
class Adress{
	int plotno;
	String at,post;
	public Adress(int p,String a,String po) {
		plotno=p;
		at=a;
		post=po;
	}
	public String toString() {
		return plotno + " " + at + " " + post;
	}
}
public class A2_2Q7 {

	public static void main(String[] args) {
		TreeMap<String,Adress> t=new TreeMap<>();
		 t.put("Smruti",new Adress(101,"Main Street","cityA"));
		 t.put("Smita",new Adress(102,"Park Avenue","cityB"));
		 System.out.println("Adrss Book Entries");
		 Iterator<Map.Entry<String, Adress>> iterator=t.entrySet().iterator();
		 while(iterator.hasNext()) {
			 Map.Entry<String, Adress> entry=iterator.next();
			 System.out.println(entry.getKey()+"->"+entry.getValue());
		 }

	}

}
