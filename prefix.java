import java.util.Scanner;

public class prefix {

    // program for the prefix sum p
    // function for preficx sum
    public static int[] sum(int[] arr) {
        int[] pre = new int[arr.length];

        int n = arr.length - 1;
        pre[0] = arr[0];
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + arr[i];

        }
        return pre;
    }
    // function for prefix inplace array

    public static int[] sum2(int[] arr, int l, int r) {

        arr[0] = arr[0];

        for (int i = r; i < l; i++) {
            arr[i] = (arr[i] += arr[i - 1]);

        }
        return arr;
    }

    // function for printing the prefix sum array
    public static void print(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // this is the main function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        while (q > 0) {

            System.out.println("Enter the first term: ");
            int l = sc.nextInt();
            System.out.println("Enter the last term: ");
            int r = sc.nextInt();
            sum2(arr, l, r);
            print(arr);
            q--;
        }

    }

}
