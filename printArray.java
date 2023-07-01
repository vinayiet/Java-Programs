
import java.util.Scanner;

public class printArray {
    public static void print(int[] arr, int idx) {

        int n = arr.length;

        // base case
        if (n == idx) {
            return;

        }
        // self work
        System.out.println(arr[idx]);

        // with the help of recursion
        print(arr, idx + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 5 };
        print(arr, 0);

    }

}
