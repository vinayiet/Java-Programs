import java.util.Scanner;

public class rotateMatrices {

    /*
     * steps involve in this code for the rotation of the matrix is
     * 1. find the transpose of the matrix
     * 2. reverse each row the matrix
     * 3. print the matrix
     */

    static void printArray(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void inplace(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void rotateMatrix(int[][] arr, int r) {
        inplace(arr, r, r);

        for (int i = 0; i < r; i++) {
            reverseArray(arr[i]);
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

        rotateMatrix(arr, r);
        System.out.println("Matrix after rotation:");
        printArray(arr, r, c);
    }
}
