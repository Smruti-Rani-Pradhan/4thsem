import java.util.*;
class Book{
	int id;
	String name;
	String author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	int qty;
	public Book(int i,String n,String a,int q) {
		id=i;
		name=n;
		author=a;
		qty=q;
	}
	public String toString() {
        return id + " " + name + " " + author+" "+qty;
    }
}
public class A2_2Q5 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 HashMap<Integer,Book> b=new HashMap<>();
	 b.put(101,new Book(101,"Lady Doctor","Kavita Rao",5));
	 b.put(102,new Book(102,"HARRY potter","j.k rowling",5));
	 System.out.println("Library Collections:");
	 for(Book bk:b.values()) {
		 System.out.println(bk);
	 }
	 //a particular book name is present on the map
	 System.out.println("Enter Book name:");
     String name = sc.nextLine();
     boolean found=false;
     for(Book bk:b.values()) {
		 if(bk.getName().equalsIgnoreCase(name)) {
			 found =true;
			 break;
		 }
	 }
     System.out.println("Book exists: " + found);
     //part b
     System.out.println("Enter book ID to remove:");
     int bid=sc.nextInt();
     if(b.containsKey(bid)) {
    	 b.remove(bid);
     }
     else {
    	 System.out.println("Book id not found");
     }
     //updated book Collections
     System.out.println("Updated Library Collection");
     for(Book bk:b.values()) {
		 System.out.println(bk);
	 }
	 

	}

}
