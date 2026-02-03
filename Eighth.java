import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Eighth {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Cat");

        Set<String> uniqueAnimals = new LinkedHashSet<>(animals);

        animals.clear();
        animals.addAll(uniqueAnimals);

        System.out.println(animals);
    }
}
