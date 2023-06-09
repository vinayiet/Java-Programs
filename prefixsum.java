import java.util.*;

public class prefixsum {
    static int[] makeprefixsum(int[] arr) {

        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;

    }

    public static void print(int[] pref) {
        System.out.println("The sorted array is : ");

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
