public class suarray {
    public static int[] sum(int[] arr) {
        // making the temporary array
        int[] arr2 = new int[arr.length - 1];
        int i = 0;
        int sum = 0;

        while (i < arr.length - 1) {
            sum += arr[i];
            arr2[i] = sum;

            i++;
        }
        // copying the elements in the original array
        while (i < arr.length - 1) {
            arr[i] = arr2[i];
            i++;

        }
        return arr;

    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(sum(arr));

    }

}
