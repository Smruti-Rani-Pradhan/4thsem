
class Pair<K, V> {
 
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
}

public class A2_2Q1 {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        Pair<String, String> pair2 = new Pair<>("color", "Red");
        Pair<Double, Integer> pair3 = new Pair<>(3.14, 100);

        System.out.println(pair1);  // Output: Key: 1, Value: Apple
        System.out.println(pair2);  // Output: Key: color, Value: Red
        System.out.println(pair3);  // Output: Key: 3.14, Value: 100

        pair1.setKey(2);
        pair1.setValue("Banana");

        System.out.println("Updated " + pair1);  

        // Retrieve values using getters
        System.out.println("Key of pair 1: " + pair1.getKey()); 
        System.out.println("Value of pair 1: " + pair1.getValue()); 
    }
}
