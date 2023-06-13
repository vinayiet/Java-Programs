import java.util.*;

public class sortoddeven {
    static int[] sort(int[] arr, int n) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;

            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int left, int right) {

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }

    public static void print(int[] arr) {
        System.out.println("The sorted array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
        System.out.println("The original array is:");
        print(arr);
        System.out.println("The sorted array is:");
        sort(arr, n);
        print(arr);

    }

}
