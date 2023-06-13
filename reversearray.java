import java.util.Scanner;

class reversearray {
    public static int[] reverse(int[] arr, int n) {
        int[] arr1 = new int[n];
        int j = 0;
        for (int i = n - 1; i > 0; i++) {
            arr1[j++] = arr[i];

        }
        return arr1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = reverse(arr, n);
        print(ans);
    }

    public static void print(int[] ans) {
        System.out.println("The reversed array is : ");

        for (int i = 0; i < ans.length; i++) {

            System.out.println(ans[i] + " ");
        }
    }
}