import java.util.Scanner;

public class printsum {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to sum:");
        int n = sc.nextInt();
        int sum = 0;
        int counter = 0;
        while (counter <= n) {
            sum = sum + counter;
            counter++;
        }
        System.out.println(sum);
    }

}
