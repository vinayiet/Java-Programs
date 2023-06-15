import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

    // reversing the string using the arraylist method

    static void ReverseList(ArrayList<Integer> list) {

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {

            Integer temp = Integer.valueOf(list.get(i));

            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;

        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new java.util.ArrayList<>();

        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("Original Array:");
        System.out.println(list);

        System.out.println("Reversed Array:");
        // ReverseList(list);
        // alternative method of reversing the elements which are present in the
        // arraylist
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("");
    }

}
