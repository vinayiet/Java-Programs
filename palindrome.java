import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // for printing the space 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for the first half of the structure
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
               
            }
            // for the second half of the structure
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
               
            }
            System.out.println();
        }

    }

}
