import java.util.*;
 
public class func{
 
   public static void printfactorial(int a) {
       //loop
       if(a < 0) {
           System.out.println("Invalid Number");
           return;
       }
       int factorial = 1;
 
       for(int i=a; i>=1; i--) {
           factorial = factorial * i;
       }
 
       System.out.println(factorial);
       return;
      }
      public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
              printfactorial(a);
        
        
      }
    }