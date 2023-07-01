import java.util.Scanner;

public class findmultiples {
    public static void multiples(int num, int k) {
        if (k == 1) {
            System.out.println(num);
            return;
        }
        multiples(num, k - 1);
        System.out.println(num * k);

    }

    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        int num = cs.nextInt();
        int k = cs.nextInt();
        multiples(num, k);
    }
}
