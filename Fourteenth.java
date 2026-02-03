import java.util.ArrayList;
import java.util.Arrays;

public class Fourteenth {
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "apple", "banana", "orange", "grape", "kiwi"
        ));


        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            word = word.replaceAll("(?i)[aeiou]", "*");
            words.set(i, word);
        }

        System.out.println("Words with vowels replaced: " + words);
    }
}
