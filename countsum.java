
public class countsum {
    public static int count(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    sum++;
                }

            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 1, 5 };
        int target = 6;
        System.out.println(count(arr, target));

    }
}