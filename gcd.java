import java.util.Scanner;

public class gcd {
    public static int find(int x, int y) {
        if (y == 0) {
            return x;
        }

        return find(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num:");
        int x = sc.nextInt();
        System.out.println("Enter the second num:");
        int y = sc.nextInt();
        System.out.println(find(x, y));
    }

}
