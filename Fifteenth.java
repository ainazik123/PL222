import java.util.ArrayList;
import java.util.Arrays;

public class Fifteenth {
    public static void main(String[] args) {

        // Исходный список чисел
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        ));

        // Списки для чётных и нечётных чисел
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        // Разделяем числа на чётные и нечётные
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        // Выводим результат
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
