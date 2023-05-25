import java.util.Scanner;

public class palindrome2 {
    public static void palindrome(int n){
        int dec = 0; 
        int pow = 0;
        int rem = 0;
        while( n > 0){
            rem = n % 10;
             dec =  dec+rem *(int)Math.pow(10,pow);
             dec = dec * 10;
        }
        if(dec==n){
            System.out.println("This is a palindrome.");
        }
        else{
            System.out.println("This is not a palindrome.");
        }
    }
    public static void main(String args[]){
     System.out.println("Enter the num : ");
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         palindrome(n);
        
    }
    
}
