public class findindices {
    public static void find(int arr[], int key, int index) {
        // base case
        if (index == arr.length) {
            return;
        }
        // kaam
        if (arr[index] == key) {
            System.out.print(index + " ");
        }
        // for all the cases which are left in the array
        find(arr, key, index + 1);

    }

    public static void main(String agrs[]) {
        int arr[] = { 1, 2, 3, 2, 5, 2 };
        find(arr, 2, 0);

    }

}
