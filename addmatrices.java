import java.util.Scanner;

public class addmatrices {
    static void printArray(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Addition is not possible for matrices with different dimensions.");
            return;
        }

        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        printArray(sum, r1, c1);
    }

    public static void main(String[] args) {
        // 2D array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for matrix 1:");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns for matrix 1:");
        int c1 = sc.nextInt();

        System.out.println("Enter the elements for matrix 1:");
        int[][] arr1 = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows for matrix 2:");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns for matrix 2:");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter the elements for matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The first matrix is: ");
        printArray(arr1, r1, c1);
        System.out.println("The second matrix is : ");
        printArray(arr2, r2, c2);

        System.out.println("Performing matrix addition...");
        System.out.println("Resultant matrix after addition:");
        add(arr1, r1, c1, arr2, r2, c2);
    }
}
