import java.util.ArrayList;

public class Nineth {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("New York");

        String[] cityArray = cities.toArray(new String[0]);

        for (String city : cityArray) {
            System.out.println(city);
        }
    }
}
