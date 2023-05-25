import java.util.*;

public class string {
  public static void main(String[] agrs) {
    // concatination (adding of two strings)
    /*
     * Scanner sc=new Scanner(System.in);
     * String name=sc.nextLine();
     * System.out.println("Your name is "+name);
     */
    String firstName = "Vinay";
    String lastName = "Sharma";
    // String fulName= firstName+" "+lastName;
    // System.out.println(fulName.length());

    // charAt(i)
    // for(int i=0; i<fulName.length(); i++)
    // {
    // System.out.println(fulName.charAt(i));
    // }

    // compare two strings
    if (firstName.compareTo(lastName) == 0) {
      System.out.println("The strings are equal.");

    }

    else {
      System.out.println("Strings are not equal.");
    }
  }

  public int length() {
    return 0;
  }

  public Object charAt(int i) {
    return null;
  }

}
