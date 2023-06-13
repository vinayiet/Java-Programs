
import java.util.*;

public class prefixsum3 {
    static int[] makeprefixsum(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;

    }

    public static void print(int[] pref) {
        System.out.println("The prefixsum is : ");

        for (int i = 0; i < pref.length; i++) {

            System.out.print(pref[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();

        }
        int[] pref = makeprefixsum(arr);
        System.out.print("Enter the number of the queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("enter left range:");
            int l = sc.nextInt();
            System.out.println("enter right rnage: ");
            int r = sc.nextInt();

            int ans = pref[r] - pref[l - 1];
            System.out.println("Sum : " + ans);
        }

    }
}
