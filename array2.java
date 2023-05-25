import java.util.*;
public class array2 { // program to print average value of elements
    public static void main(String[] agrs)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements are to be stored:");
    int n=sc.nextInt();
    int[] array2= new int[n];;
    for(int i=0; i<n; i++)
    {
         array2[i]=sc.nextInt();
    }
    int sum=0;
    for(int i : array2){
        sum+=i;
    }
    int average=sum/n;
    System.out.println("The average of the given aray is:"+average);

    }
    
}
