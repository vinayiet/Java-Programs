import java.util.Scanner;

public class transposeInplace {
    static void printArray(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // in this code we basically not take any extra array for transpose of matrix
    static void inplace(int[][] arr, int r, int c) {

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i; j++) {
                // swap the elements arr[i][j] to the arr[j][i]

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the matrix:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns for the matrix:");
        int c = sc.nextInt();

        System.out.println("Enter the elements for the matrix:");
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        inplace(arr, r, c);
        printArray(arr, r, c);
    }
}
