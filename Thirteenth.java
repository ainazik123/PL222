import java.util.ArrayList;
import java.util.Arrays;

public class Thirteenth {
    public static void main(String[] args) {

        // Список песен
        ArrayList<String> songs = new ArrayList<>(Arrays.asList(
                "Yesterday", "Hey Jude", "Imagine", "Let It Be", "ABC"
        ));

        if (songs.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        // Изначально предполагаем, что первая песня самая короткая
        String shortest = songs.get(0);

        // Проходим по всему списку
        for (String song : songs) {
            if (song.length() < shortest.length()) {
                shortest = song;
            }
        }

        System.out.println("Shortest song: " + shortest);
    }
}
