import java.util.*;

public class findequalsub {

    static int findtotalsum(int[] arr) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        return totalsum;
    }

    static boolean findequal(int[] arr) {
        int totalsum = findtotalsum(arr);

        int pref = 0;
        for (int i = 0; i < arr.length; i++) {
            pref += arr[i];
            int suf = totalsum - pref;
            if (pref == suf) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partition possible: " + findequal(arr));
    }
}
