public class countduplicateelements {
    public static int countelements(int arr[]) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[3]) {
                count++;
            }

        }

        return count;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 2, 3, 1, 4, 5 };
        int ans = countelements(arr);
        System.out.println(ans);
    }

}
