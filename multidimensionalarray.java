import java.util.Scanner;

public class multidimensionalarray {

    static void printArray(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 2d array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of column:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter the Elements into the array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr, r, c);
    }
}
