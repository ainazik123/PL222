import java.util.ArrayList;
import java.util.Arrays;

public class Eleventh {
    public static void main(String[] args) {


        ArrayList<String> countries1 = new ArrayList<>(Arrays.asList(
                "USA", "Germany", "France", "Japan", "India"));


        ArrayList<String> countries2 = new ArrayList<>(Arrays.asList(
                "Canada", "France", "Germany", "Brazil", "India"));


        ArrayList<String> commonCountries = new ArrayList<>(countries1);


        commonCountries.retainAll(countries2);


        System.out.println("Common countries: " + commonCountries);
    }
}
