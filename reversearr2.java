public class reversearr2 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;

        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr);
        print(arr);

    }
}