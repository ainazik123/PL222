
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> books1 = new ArrayList<>();
        books1.add("1984");
        books1.add("Brave New World");
        books1.add("The Hobbit");

        ArrayList<String> books2 = new ArrayList<>();
        books2.add("The Hobbit");
        books2.add("Dune");
        books2.add("1984");


        Set<String> uniqueBooks = new LinkedHashSet<>();

        uniqueBooks.addAll(books1);
        uniqueBooks.addAll(books2);

        ArrayList<String> mergedBooks = new ArrayList<>(uniqueBooks);

        System.out.println(mergedBooks);
    }
}
