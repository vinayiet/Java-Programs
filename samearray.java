public class samearray {
    public static boolean check(int a[], int b[]) {
        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {
                System.out.println(" not same");
                return false;

            }

        }

        System.out.println("both the arrays are  same.");
        return false;
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 3, 2, 1, 4, 5 };
        check(a, b);

    }

}
