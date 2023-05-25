import java.util.Scanner;

public class friendsparing {
    public static int pair(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        // choices
        // single
        int fnm1 = pair(n - 1);

        // pairing with mn2
        int fnm2 = pair(n - 2);
        int paiways = (n - 1) * pair(fnm2);

        // total ways for pairing of the friends
        int totalways = fnm1 + paiways;

        return totalways;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = pair(n);
        System.out.println(ans);
    }

}
