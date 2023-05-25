public class repeatvalue {
    public static int repeat(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }

        }
        return -1;
    }

    public static int second(int arr[]) {

    }

    public static void main(String args[]) {
        int[] arr = { 0, 2, 2, 4, 1, 1 };
        System.out.println(repeat(arr));

    }

}
