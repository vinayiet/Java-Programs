public class backtrack {

    public static void dim(int[] arr, int i, int val) {
        // Base case
        if (i == arr.length) {
            print(arr);
            return;
        }

        // Work
        arr[i] = val;
        dim(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;

    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        dim(arr, 0, 1);
        print(arr);
    }
}
