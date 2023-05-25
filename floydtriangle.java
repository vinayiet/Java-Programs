import java.util.Scanner;

public class floydtriangle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        for (int rows = 1; rows <= n; rows++) {
            for (int column = 1; column <= rows; column++) {
               System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
