import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class calculatoralpha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B:");
        int b = sc.nextInt();
        System.out.println("Enter the operator:");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+' : System.out.println( a + b);
                break;
                case '-' : System.out.println( a - b);
                break;
                case '*' : System.out.println( a * b);
                break;
                case '/' : System.out.println( a / b);
                break;
               
                default: System.out.println("You have entered the invalid input.");

        }
    }

}
