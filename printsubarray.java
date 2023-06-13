import java.util.*;

public class printsubarray {

    static void prints(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int end = arr[j];
                if (end >= arr.length) { // add check for end index
                    end = arr.length - 1; // set end to the last index
                }
                for (int k = start; k <= end; k++) {
                    System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        prints(arr);
    }
}
