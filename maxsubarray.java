import java.util.*;

public class maxsubarray {
    // we have to find to maxsum of the subarray
    static int maxsum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = i; k < j; k++) {
                    // subarray is stored
                    current += arr[k];
                    if (max < current) {
                        max = current;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

    }

    int ans = maxsum(null);

}
