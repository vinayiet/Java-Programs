import java.util.Scanner;
public class functoverloading{

    public static int sum(int a, int b){
        return a+b; 
    }
    public static int sum(int a, int b,int c){
        return a+b+c; 
    }
    public static int sum(int a, int b, int c,int d){
        return a+b+c+d; 
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println();
        System.out.println(sum(a,b,c));
        System.out.println(sum(a,b,c,d));



    }
}
