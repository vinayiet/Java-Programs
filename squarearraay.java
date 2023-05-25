public class squarearraay {
    //
    public static int[] square(int[] arr) {
        int[] nn = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] * arr[i]);

        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = { 2, 3, 4, 5, 1 };
        square(arr);
        print(arr);

    }

}
