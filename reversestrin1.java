import java.util.*;
class reversestrin1{
    //Exmple on stringbuffer class
    //append method
    public static void main(String[] args){
       StringBuffer sb=new StringBuffer("Vinay");
       sb.append("Sharma");
 System.out.println(sb);
       //insert method
       System.out.println("after inserting an space in between the string");
       sb.insert(6, " ");
       System.out.println(sb);
       //deleting the string by delete method 
       System.out.println("after applying the deletion operation in the string");
       sb.delete(6, 10);
       System.out.println(sb);

       //replace method in java
       System.out.println("appying the replace method in java");
       sb.replace(6, 8, "   ");
       System.out.println(sb);
       //for reversing the string in java
       System.out.println("for reversing the string in java");
       sb.reverse();
       System.out.println(sb);
       //if you want to find the capacity of the string then use the capacity method
       System.out.println("to find the capacity");
       
       System.out.println(sb.capacity());
       // length of the stering
       System.out.println("length of the string ");
  
       System.out.println(sb.length());
    }
}
