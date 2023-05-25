public class rotatear {
    public static void rotate(int[] arr, int d) {
        for (int i = 0; i < arr.length; i += d) {

            int start = i;
            int end = arr.length - 1;
            while (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int d = 2;
        rotate(arr, d);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
