import java.util.Scanner;

public class fibonacci {
    public static void fibonaci(int a, int b, int n)
    {
        if(n==0){
            return ;
        }
     int c=a+b;
     System.out.println(c);
     fibonaci(b, c, n-1);   
    }
    public static void main(String[] args){
        int a=0;
        int b=1;
        
        System.out.println("Enter the number of terms for fibonaci series:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        

        fibonaci(a, b, n-2);
    }
}
    