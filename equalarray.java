import java.util.*;

public class equalarray {

    public static boolean comparearray(int[] arrayA, int[] arrayB) {
        int n = arrayA.length;
        int m = arrayB.length;
        Arrays.sort(arrayB);
        Arrays.sort(arrayB);
        if (n != m)
            return false;
        for (int i = 0; i < n; i++) {
            if (arrayA[i] != arrayB[i]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be stored:");
        int n = sc.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];

        System.out.println("Enter the elements in first array:");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in second array:");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = sc.nextInt();
        }
        if (comparearray(arrayA, arrayB)) {
            System.out.println("Both the array are same.");
        } else {
            System.out.println("Both the array are not same.");
        }

    }

}
