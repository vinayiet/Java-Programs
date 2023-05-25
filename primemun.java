import java.util.Scanner;

public class primemun {
    public static void prime(int n){
        if(n%2==1 && n/n==1 && n/1==n){
            System.out.println("This is prime number : ");
        }
        else{
            System.out.println("This is not a prime number. ");
        }
      }
    public static void main(String args[]){
        System.out.println("Enter the num: ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      prime(n);
    }
    
}
