import java.util.Objects;

class Animal1 {
    private String name;
    private String color;
    private String type;
    
    public Animal1(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    // Overriding the hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, color, type);
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}

public class A2Q6 {
    public static void main(String[] args) {
        // Creating multiple Animal1 objects
        Animal1 A1 = new Animal1("Dog", "Brown", "Pet");
        Animal1 A2 = new Animal1("Tiger", "Orange", "Wild");
        Animal1 A3 = new Animal1("Cat", "Black", "Pet");

        // Printing the hash codes of the Animal1 objects
        System.out.println("Hash code of Animal11: " + A1.hashCode());
        System.out.println("Hash code of Animal12: " + A2.hashCode());
        System.out.println("Hash code of Animal13: " + A3.hashCode());
    }
}

