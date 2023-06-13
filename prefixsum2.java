
import java.util.*;

public class prefixsum2 {
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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        int[] pref = makeprefixsum(arr);
        print(pref);

    }
}
