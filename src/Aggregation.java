class department{
	private String name;
	public department(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class University{
	private String Universityname;
	public University(String Universityname) {
		this.Universityname=Universityname;
	}
	public void adddepartment(department department) {
		System.out.println(department.getName()+" department added to "+Universityname);
	}
	
}

public class Aggregation {

	public static void main(String[] args) {
		department d=new department("comp science");
		University u=new University("oxford");
		u.adddepartment(d);

	}

}
