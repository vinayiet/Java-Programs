import java.util.Scanner;

public class diagonalsum {
    public static int sum(int arr[], int n) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; i++) {
                // primary diagonal sum
                if (i == j) {
                    sum1 += arr[i][j];
                }
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the element in the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sum(null);
    }

}
