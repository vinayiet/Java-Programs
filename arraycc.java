import java.util.*;

public class arraycc {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length - 1; i++) {
            marks[i] = marks[i] + 1;

        }
    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99, 100 };
        update(marks);
        for (int i = 0; i < marks.length - 1; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();

    }

}
