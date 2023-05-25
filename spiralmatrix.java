import java.util.Scanner;

public class spiralmatrix {
    public static void spiral(int arr[][]) {
        int startRow = 0;
        int startColumn = 0;
        int endRow = arr.length - 1;
        int endColumn = arr.length - 1;
        System.out.println("The spiral matrix is : ");
        //
        while (startRow <= endRow && startColumn <= endColumn) {
            // printing the top of the matrix
            for (int i = startColumn; i <= endColumn; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            // printing the right of the matrix
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(arr[j][endColumn] + " ");
            }
            // printing the bottom of the matrix
            for (int k = endColumn - 1; k >= startColumn; k--) {
                System.out.print(arr[endRow][k] + " ");
            }
            // printing the left of the matrix
            for (int l = endRow - 1; l >= startRow + 1; l--) {
                System.out.print(arr[l][startColumn] + " ");

            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;

        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        spiral(arr);

    }

}
