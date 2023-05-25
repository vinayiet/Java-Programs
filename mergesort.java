public class mergesort {
    // function for printing the sorted array
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println()
    }

    public static void merginsort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // mid of the array
        int mid = si + (ei - si) / 2;

        // applying mergesort on the array for n-1 elements
        // for the left of the array appyling the mergesort
        merginsort(arr, si, mid);

        // for the right of the array
        merginsort(arr, mid + 1, ei);

        // applying the new function merge() to merge the sorted elements
        merge(arr, si, ei, mid);

    }

    // function for the merging the elements
    public static void merge(int arr[], int si, int ei, int mid) {
        // initializing the new temporary array
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        // putting the elements into the temporary array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[k];
                j++;
                k++;

            }
            // if elements are left in left sorted array after merging the elements
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
            // similarly for the right
            while (j <= ei) {
                temp[k++] = arr[j++];
            }

        }
        // copy the elements from the temporary array into the the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // main function
    public static void main(String args[]) {
        int arr[] = { 7, 3, 5, 6, 2 };
        merginsort(arr, 0, arr.length - 1);

        print(arr);

    }

}
