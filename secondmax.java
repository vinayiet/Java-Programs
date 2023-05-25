public class secondmax {
    public static int mx(int arr[]) {
        int max = Integer.MIN_VALUE;

        // here we find the first max of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // using this function we find the second max
    public static int sendmax(int arr[]) {

        // calling the first max function to get the fisrt max
        int max = mx(arr);

        for (int i = 0; i < arr.length; i++) {
            // replace all the max value element with the infiniity
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;

            }
        }
        // again we call the first function to find the second max
        int x = mx(arr);
        return x;

    }

    // this is the main function
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(sendmax(arr));

    }

}
