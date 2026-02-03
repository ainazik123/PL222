import java.util.ArrayList;
import java.util.Arrays;

public class Nineteenth {
    public static void main(String[] args) {

        // Список фруктов
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Apple", "Banana", "Orange", "Kiwi", "Mango"
        ));

        // Проходим по списку и заменяем каждый элемент на его длину
        ArrayList<Integer> lengths = new ArrayList<>();
        for (String fruit : fruits) {
            lengths.add(fruit.length());
        }

        System.out.println("Lengths of fruits: " + lengths);
    }
}
