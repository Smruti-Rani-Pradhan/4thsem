import java.util.*;
class User{
	private int age;
	private String name;
	public User(int a,String n) {
		age=a;
		name=n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class A2_2Q2 {

	public static void main(String[] args) {
		ArrayList<User> stu=new ArrayList<>();
		stu.add(new User(22,"smruti"));
		stu.add(new User(22,"smita"));
		stu.add(new User(22,"shreya"));
		System.out.println("Users before sorting");
		for(User u:stu) {
			System.out.println("Name:"+u.getName()+",Age"+u.getAge());
		}
//		Collections.sort(stu,Comparator.comparingInt(User::getAge));
//		System.out.println("Users after sorting");
//		for(User u:stu) {
//			System.out.println("Name:"+u.getName()+",Age"+u.getAge());
//		}
		Collections.sort(stu,Comparator.comparingInt(User::getAge).thenComparing(User::getName));
		System.out.println("Users after sorting");
		for(User u:stu) {
			System.out.println("Name:"+u.getName()+",Age"+u.getAge());
		}


	}

}
