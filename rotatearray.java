public class rotatearray {
    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] arr1 = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            arr1[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr1[j++] = arr[i];
        }
        return arr1;
    }

    public static void print(int[] ans) {
        System.out.println("The rotated array is:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 4;
        int[] ans = rotate(arr, k);
        print(ans);
    }
}
