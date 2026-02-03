import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Twelveth {
    public static void main(String[] args) {

        // Список имен
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Anna", "John", "Mike", "Sara", "Alex", "Kate"
        ));

        // Используем Iterator для безопасного удаления элементов во время обхода
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.length() % 2 == 0) { // если длина чётная
                iterator.remove();
            }
        }

        System.out.println("Names with odd length: " + names);
    }
}
