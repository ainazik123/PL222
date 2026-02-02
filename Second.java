import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Inception");
        movies.add("The Lord of the Rings");
        movies.add("Avatar");
        movies.add("Pirates of the Caribbean");

        String longest = movies.get(0);

        for (String movie : movies) {
            if (movie.length() > longest.length()) {
                longest = movie;
            }
        }

        System.out.println("Longest movie title: " + longest);
    }
}
