import java.util.Scanner;

public class table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to print the table:");
        int n = sc.nextInt();
        System.out.println("The table is");
        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.println(n + " * " + i + " = " + table);
        }

    }
}
