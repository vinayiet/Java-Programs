public class secondmin {
    // with the help of this function we find the first min of the array
    public static int min(int arr[]) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];

            }
        }
        return minimum;
    }

    // with the help of this function we find the second min of the function
    public static int min2(int[] arr) {
        int ndmin = min(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ndmin) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int ans = min(arr);
        return ans;
    }

    // this is main function
    public static void main(String args[]) {

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(min2(arr));
    }

}
