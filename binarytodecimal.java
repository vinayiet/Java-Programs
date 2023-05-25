import java.util.Scanner;

public class binarytodecimal{
    public static void bintodec(int binNum) {
        int pow = 0; 
        int decNum = 0;
        while( binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of the binary num is: "+ decNum);

    }
    public static void decTobinary(int decNum){
        int bin = 0;
        int pow = 0;
        while(decNum > 0){ 
           int rem = decNum % 2;
    bin = bin +(rem*(int)Math.pow(10,pow));
          
            pow++;
        }
        System.out.println("The binary number of the given decimal num is : "+bin);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        bintodec(binNum);

    }


}