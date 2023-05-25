public class checksum {
    public static boolean check(int[] arr) {

    }

    public static int[] sumprefix(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        return arr;

    }

    public static int[] sumsufix(int[] arr) {
        while (arr.length > 0) {

        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(check(arr));

    }

}
