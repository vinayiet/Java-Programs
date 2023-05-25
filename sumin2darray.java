public class sumin2darray {
    public static int sum(int arr[][]) {
        int sum = 0;
        // sum of the numbers present in the second row
        for (int i = 0; i < arr.length; i++) {
            sum += arr[1][i];
        }
        return sum;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 4, 9 }, { 11, 4, 3, }, { 2, 2, 3 } };
        int result = sum(arr);
        System.out.println(result);
    }

}
