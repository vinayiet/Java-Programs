import java.util.*;

public class squarearray {
    static int[] square(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] arr2 = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                arr2[k++] = arr[left] * arr[left];
                left++;

            } else {
                arr2[k++] = arr[right] * arr[right];

                right--;
            }

        }
        return arr2;

    }

    public static void print(int[] ans) {
        System.out.println("The sorted array is : ");

        for (int i = 0; i < ans.length; i++) {

            System.out.print(ans[i] + " ");
        }
    }

    public static int[] reverse(int[] arr) {
        int n = arr.length - 1;
        int[] arr1 = new int[n];
        int j = 0;
        for (int i = n - 1; i > 0; i++) {
            arr1[j++] = arr[i];

        }
        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int[] ans = square(arr);
        reverse(arr);
        print(ans);
    }
}
