import java.util.Scanner;

public class primenum{
    public static boolean isprime(int n){
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                return false;

            }
            
        }
       return true;
    }
    public static void  findnum(int n){
        for(int i = 2; i <= n; i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findnum(n);
        
    }

}
