public class rotateinplace {
    public static void rotate(int[] arr, int key) {
        int n = arr.length - 1;
        key = key % n;

        reverse(arr, 0, n - key);
        reverse(arr, n - key, n);
        reverse(arr, 0, n);
        print(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;

        }
    }

    // function for printting the rotated element
    public static void print(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");

        }

    }

    // this is main function
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotate(arr, 1);

    }

}
