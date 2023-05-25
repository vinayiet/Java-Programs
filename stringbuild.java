 
import java.util.*;
import java.io.StringReader;
class stringbuild{
  public static void main(String[] agrs)
  {
    //PROGRAM TO REVERSE A STRING
    System.out.println("Enter the String to reverse :");
    Scanner sc=new Scanner(System.in);
    String ch=sc.nextLine();
    StringBuilder sb=new StringBuilder(ch);
    for(int i=0; i<=sb.length()/2; i++)
    {
      int front=i;
      int back=sb.length()-1-i;

      
      char frontChar=sb.charAt(front);
      char backChar=sb.charAt(back);
             
      sb.setCharAt(front, backChar);
      sb.setCharAt(back,frontChar);

    }
 System.out.println(sb);

  }
}
