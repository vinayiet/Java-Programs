public class recursion14 {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int s1 = sum(n - 1);
        int sn = n + sum(n - 1);
        return sn;
    }

    public static void main(String args[]) {
        int n = 3;
        int ans = sum(n);
        System.out.println(ans);

    }

}
