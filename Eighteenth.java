import java.util.ArrayList;
import java.util.Arrays;

public class Eighteenth {
    public static void main(String[] args) {


        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                "Inception", "Titanic", "Avatar", "The Godfather", "Up"
        ));

        if (movies.size() < 2) {
            System.out.println("Not enough movies to find second largest.");
            return;
        }


        String largest = movies.get(0);
        String secondLargest = null;

        for (int i = 1; i < movies.size(); i++) {
            String current = movies.get(i);

            if (current.length() > largest.length()) {
                secondLargest = largest;
                largest = current;
            } else if (secondLargest == null || current.length() > secondLargest.length()) {
                if (!current.equals(largest)) {
                    secondLargest = current;
                }
            }
        }

        System.out.println("Second largest movie by length: " + secondLargest);
    }
}
