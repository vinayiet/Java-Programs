import java.util.ArrayList;
import java.util.Collections;

public class sortStrings {

    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();

        l1.add("Welcome");
        l1.add("To");
        l1.add("My");
        l1.add("Github");
        l1.add("Account");

        System.out.println("Original Array of strings: " + l1);

        Collections.sort(l1, Collections.reverseOrder());

        System.out.println("Sorted Array of strings: " + l1);
    }
}
