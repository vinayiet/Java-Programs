
public class reversearray {
    public static void reverse(int arr[], int k, int n) {
        int start = 0;
        int end = arr.length;
        while (start < k) {
            int temp = arr[k];
            arr[start] = arr[k];
            arr[start] = temp;
            start++;
            k--;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length - 1;
        int k = 3;
        reverse(arr, k, n);
        System.out.print("The reversed array is :");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
