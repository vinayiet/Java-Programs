public class sort01 {
    public static int[] sort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }

        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;

        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }

        return arr;

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 0, 0, 1, 0, 0, 1 };
        sort(arr);
        print(arr);
    }

}
