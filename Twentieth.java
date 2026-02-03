import java.util.ArrayList;
import java.util.Arrays;

public class Twentieth {
    public static void main(String[] args) {


        ArrayList<String> hr = new ArrayList<>(Arrays.asList("Alice", "Bob"));
        ArrayList<String> it = new ArrayList<>(Arrays.asList("Charlie", "David", "Eva"));
        ArrayList<String> sales = new ArrayList<>(Arrays.asList("Frank", "Grace"));


        ArrayList<ArrayList<String>> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(it);
        departments.add(sales);


        for (int i = 0; i < departments.size(); i++) {
            System.out.println("Department " + (i + 1) + ": " + departments.get(i));
        }
    }
}
