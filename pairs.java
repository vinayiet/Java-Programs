
import java.util.*;

public class pairs {
    public static void printpairs(int[] arr) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {

                System.out.print("( " + curr + ", " + arr[j] + " )");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs:" + tp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        printpairs(arr);
    }
}