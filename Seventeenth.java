import java.util.ArrayList;
import java.util.Arrays;

public class Seventeenth {
    public static void main(String[] args) {

        // Список имен студентов, включая null
        ArrayList<String> students = new ArrayList<>(Arrays.asList(
                "Alice", null, "Bob", "Charlie", null, "David"
        ));

        // Удаляем все null значения
        students.removeIf(name -> name == null);

        System.out.println("Students without nulls: " + students);
    }
}
