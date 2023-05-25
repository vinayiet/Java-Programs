import java.util.Scanner;

public class transposematrix {
    public static void transpose(int arr[][], int n, int m) {
        System.out.println("The transposed matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp = arr[i][j];
                arr[j][i] = arr[i][j];
                arr[j][i] = temp;
                System.out.print(temp);
            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the rows :");
        int n = sc.nextInt();
        System.out.println("Enter the number of the column :");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The enterd matrix is");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        transpose(arr, n, m);

    }

}
