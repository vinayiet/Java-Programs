public class reapeatednum {
    public static int repeat(int arr[][]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == 7) {
                    count++;

                }

            }

        }

        return count;
    }

    public static void main(String args[]) {
        int arr[][] = { { 4, 7, 7 }, { 8, 8, 7 } };
        int result = repeat(arr);
        System.out.println(result);

    }

}
