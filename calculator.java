import java.util.*;
public class calculator {
    public static void main(String[] agrs){
      

        Scanner sc= new Scanner(System.in);


        System.out.println("Enter two numbers to calculate.");
        int a = sc. nextInt();
        int b = sc. nextInt();
        
        System.out.println("Press 1 for addition ");
        System.out.println("press 2 for subtraction ");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for divison");
        int input=sc .nextInt();
        int sum=a+b;
        int mul=a*b;
        int diff=a-b;
        int divide=a/b;
        System.out.println("The calculated value is :");
        switch(input){
          case 1:System.out.println(sum );
          break;
          case 2:System.out.println( diff);
          break;
          case 3:System.out.println( mul);
          break;
          case 4: System.out.println( divide);
          break;
        default: System.out.println("Invalid input");
        }
    }
    
}
