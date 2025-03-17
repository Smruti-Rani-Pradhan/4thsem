import java.util.HashMap;
public class HashMapExample
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "Car");
		map.put(2, "Bus");
		map.put(3, "Train");
		System.out.println(map.get(2));
	}
}
