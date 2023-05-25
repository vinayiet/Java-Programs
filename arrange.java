public class arrange {
    public static void arrangein(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;

            }
        }
        if (arr[left] % 2 == 0) {
            left++;

        }
        if (arr[right] % 2 == 1) {
            right--;
        }
        print(arr);

    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        arrangein(arr);
    }

}
