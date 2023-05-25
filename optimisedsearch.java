public class optimisedsearch {
    // optimised way for searching element in the sorted matrix
    public static boolean search(int arr[][], int key) {
        int row = 0;
        int column = arr[0].length - 1;
        while (row < arr.length && column > 0) {
            if (arr[row][column] == key) {
                System.out.println("The element found at " + row + "," + column);
                return true;

            } else if (key < arr[row][column]) {
                column--;
            } else {
                row++;
            }

        }
        System.out.println("The element not found.");
        return false;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int key = 10;
        search(arr, key);

    }
}
