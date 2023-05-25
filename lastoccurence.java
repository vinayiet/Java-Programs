public class lastoccurence {
    public static int find(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }
        int isFound = find(arr, i + 1, key);
        // this is for checking after the key
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        // this is for self check

        return isFound;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 5 };
        int key = 5;
        int i = 0;

        System.out.println(find(arr, i, key));
    }

}
