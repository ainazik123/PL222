import java.util.ArrayList;
import java.util.Arrays;

public class Sixth {
    public static void main(String[] args) {

        ArrayList<String> sports = new ArrayList<>(Arrays.asList(
                "Football", "Basketball", "Tennis", "Cricket"
        ));

        ArrayList<String> subList = new ArrayList<>(Arrays.asList(
                "Football", "Tennis"
        ));

        boolean containsSublist = sports.containsAll(subList);

        System.out.println(containsSublist);
    }
}
