import java.util.ArrayList;

public class Forth {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");

        fruits.removeIf(fruit -> fruit.equals("Banana"));

        System.out.println(fruits);
    }
}
