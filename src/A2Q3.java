import java.util.*;

class A2Q3 implements Comparable<A2Q3> {
    private String model;
    private String color;
    private int speed;
    public A2Q3(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Speed: " + speed + " km/h";
    }
    public int compareTo(A2Q3 other) {
        return Integer.compare(this.speed, other.speed);}
    public static void main(String[] args) {
        A2Q3 car1 = new A2Q3("Tesla Model S", "Red", 250);
        A2Q3 car2 = new A2Q3("Ford Mustang", "Blue", 220);
        A2Q3 car3 = new A2Q3("BMW M5", "Black", 240);
        A2Q3 car4 = new A2Q3("Audi R8", "White", 265);
        List<A2Q3> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        System.out.println("Original list of cars:");
        for (A2Q3 car : cars) {
            System.out.println(car);
        }
//        Collections.sort(cars);
        System.out.println("\nSorted list of cars by speed:");
        for (A2Q3 car : cars) {
            System.out.println(car);
        }
        if (car1.compareTo(car2) > 0) {
            System.out.println("\nCar with greater speed: " + car1);
        } else if (car1.compareTo(car2) < 0) {
            System.out.println("\nCar with greater speed: " + car2);
        } else {
            System.out.println("\nBoth cars have the same speed.");
        }
    }
}
