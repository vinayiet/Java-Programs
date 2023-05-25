public class selection {
    public static void sort(int arr[]) {

        for (int i = 0; i <= arr.length - 1; i++) {
            //here we will take the minimum as i
            int min = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                // compare minimum value to the next value
                if (arr[min] > arr[j]) {
                    //if the next value is smaller than the minmum value then 
                    min = j;
                }
                // swap the value of the min element to the other
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
// function for printing the sorted array
    public static void print(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sort(arr);
        print(arr);

    }

}
