public class recursion12 {
    // factorial by recursion method
    public static int print(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = print(n - 1);
        int factn = n * fact;
        return factn;

    }

    // print sum of n numbers
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int s1 = sum(n - 1);
        int sn = s1 + sum(n - 1);
        return sn;
    }

    // print nth fibonacci number
    public static int fibonacci(int n) {
        int fnm1 = fibonacci(n - 1);
        int fnm2 = fibonacci(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String args[]) {
        int n = 5;
        int ans = print(n);
        System.out.println(ans);

    }

}
