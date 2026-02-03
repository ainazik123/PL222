import java.util.ArrayList;

public class Trird {
    public static void main(String[] args) {

        ArrayList<String> foods = new ArrayList<>();
        foods.add("Burger");
        foods.add("Pizza");
        foods.add("Pasta");
        foods.add("Pizza");
        foods.add("Salad");
        foods.add("Pizza");

        int count = 0;

        for (String food : foods) {
            if (food.equals("Pizza")) {
                count++;
            }
        }

        System.out.println("Pizza appears " + count + " times");
    }
}