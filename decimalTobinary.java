import java.util.Scanner;

public class decimalTobinary {
    public static void decTobinary(int decNum) {
        int bin = 0;
        int pow = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;
        }
        System.out.println("The binary number of the given decimal num is : " + bin);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal num: ");
        int decNum = sc.nextInt();
        decTobinary(decNum);

    }

}
