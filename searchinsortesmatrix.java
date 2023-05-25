public class searchinsortesmatrix {
    public static void search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("The elemenet is found at" + i + "," + j);
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int key = 5;
        search(arr, key);

    }

}
