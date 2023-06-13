import java.util.*;

public class sortzerosones {

    static void sort(int[] arr) {
        int zeros = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        // putting zeros in the starting of the given array
        for (int i = 0; i < n; i++) {
            if (i < zeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }
    }

    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        print(arr);
        System.out.println("Sorted array");
        sort(arr);
        print(arr);

    }

}
