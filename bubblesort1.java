public class bubblesort1 {
    // function for sorting array
    public static void sort(int arr[]) {

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

    }

    // function for printing the sorted array
    public static void print(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 3, 2, 5, 1 };
        sort(arr);
        print(arr);

    }

}
