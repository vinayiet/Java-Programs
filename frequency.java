import java.util.Scanner;

public class frequency {
    // this method stores the frequency of the given element
    public static int[] findfrequncy(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;

    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] fre = findfrequncy(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queries :-");
        int q = sc.nextInt();
        // taking input up to q times
        while (q > 0) {
            System.out.println("Enter the number to find the frequency: ");
            int x = sc.nextInt();
            if (fre[x] > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }

    }

}
