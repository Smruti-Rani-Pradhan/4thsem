import java.util.LinkedList;
import java.util.Scanner;

class Student12 {
    int age;
    String name;
    int marks;

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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student12(int i, String n, int m) {
        age = i;
        name = n;
        marks = m;
    }

    @Override
    public String toString() {
        return age + " " + name + " " + marks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student12 s = (Student12) obj;
        return age == s.age && Integer.compare(s.marks, marks) == 0 && name.equals(s.name);
    }
}

public class A2_2Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student12> stu = new LinkedList<>();
        
        stu.add(new Student12(22, "smruti", 98));
        stu.add(new Student12(22, "smita", 95));
        stu.add(new Student12(22, "shreya", 93));

        System.out.println("List of Students:");
        for (Student12 u : stu) {
            System.out.println(u);
        }

        System.out.println("Enter student details:");
        String name = sc.nextLine();
        int age = sc.nextInt();
        int mark = sc.nextInt();
        
        Student12 search = new Student12(age, name, mark);
        boolean exists = stu.contains(search);
        System.out.println("Student exists: " + exists);

        // Consume the remaining newline character after nextInt()
        sc.nextLine();

        System.out.println("Enter student name to remove:");
        String rem = sc.nextLine();

        // Remove the student object based on the name
        stu.removeIf(student -> student.getName().equals(rem));

        System.out.println("Updated List:");
        for (Student12 u : stu) {
            System.out.println(u);
        }

        System.out.println("Number of students present: " + stu.size());
        sc.close();
    }
}
