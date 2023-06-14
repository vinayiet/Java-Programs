import java.util.Scanner;

public class transpose {

    static void printArray(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int[][] arr, int r, int c) {
        int[][] a = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[j][i] = arr[i][j];
            }
        }
        printArray(a, c, r);
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
        transposeMatrix(arr, r, c);
    }
}
