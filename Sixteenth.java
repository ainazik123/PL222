import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sixteenth {
    public static void main(String[] args) {

        // Список дней недели
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        ));

        // Количество позиций для вращения
        int positions = 2;

        // Collections.rotate вращает список на указанное количество позиций вправо
        Collections.rotate(days, positions);

        System.out.println("Days after rotation: " + days);
    }
}
