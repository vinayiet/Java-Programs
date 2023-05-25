import java.util.Scanner;

public class operationinstring {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        Char ch=sc.next();

        StringBuilder sb=new StringBuilder();
       sb.delete(1, 3);
        
        System.out.println(sb);
    }
    
}
