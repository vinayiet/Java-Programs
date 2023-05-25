public class rotatearray {
    public static void rotate(int[] arr, int key) {

        int n = arr.length;
        int i = 0;
        key = n % key;
        int[] arr1 = new int[arr.length];
        // fill the elements in the new array n - k to array length
        for (int j = n - key; j < n; j++) {
            arr1[i++] = arr[j];

        }
        // fill the elements in the new array from zero to n - k
        for (int k = 0; k < n - key; k++) {
            arr1[i++] = arr[k];
        }
        // return arr1;
        print(arr1);

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
        rotate(arr, 3);

    }

}
