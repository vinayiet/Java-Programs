import java.util.Scanner;

public class prefix2 {
    // function for the sum of prefix
    public static int[] sum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        return arr;

    }

    // this is the main function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = sum(arr);
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();
        // input for queries by the user
        while (q > 0) {

            System.out.println("Enter the range: ");
            int l = sc.nextInt();

            int r = sc.nextInt();

            int answer = ans[r] - ans[l - 1];

            System.out.println("The sum is : " + answer);

            q--;
        }

    }

}
