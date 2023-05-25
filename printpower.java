
public class printpower {
    public static long power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        long Pn = x * power(x, n - 1);
        return Pn;

    }

    /// optimised way for calculating power of the x
    public static long power1(int x, int n) {
        if (n % 2 == 0) {
            long powern = power(x, n / 2) * power(x, n / 2);
            return powern;
        }
        if (n % 2 == 1) {
            long powern = x * power(x, n / 2) * power(x, n / 2);
            return powern;
        }
        return power1(x, n);
    }

    public static void main(String args[]) {
        int x = 2;
        int n = 10;
        System.out.println(power1(x, n));

    }

}
