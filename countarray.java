import java.util.Scanner;

public class countarray {
    // sort an array which is having 0 and 1s
    public static int[] sort(int[] arr) {
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {

            }
        }
    }

    // kth smallest element in the given array
    public static void kthsmallest(int[] arr) {

    }

    // find the unique elemenet in the given array
    public static int unique(int[] arr) {

    }

    // find the number of triplets whose sum is equal to x
    public static int triplet(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == x) {
                        count++;
                    }
                }
            }
        }
        return count;

    }

    // target sum of doublets
    public static int pair(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }

    // check if array is sorted of not
    public static boolean check(int[] arr) {
        boolean checked = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                checked = false;
                break;

            }
        }
        return checked;
    }

    // count the elements which is strictily greater than given x
    public static int count(int[] arr, int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static int freq(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                count = count + 1;

            }
        }
        return count;

    }

    public static int last(int[] arr, int x) {
        int lastindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                lastindex = i;
            }
        }
        return lastindex;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 2, 5 };
        // System.out.println("Enter the element to find the frequency:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        /// int ans = freq(arr, x);
        // System.out.println(ans);
        // System.out.println(last(arr, x));
        // System.out.println(count(arr, x));

        // System.out.println(check(arr));
        System.out.println(triplet(arr, x));

    }

}
