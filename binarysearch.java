import java.util.*;
public class binarysearch {
    public static void main(String[] agrs)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of rows:");
     int rows=sc.nextInt();
     System.out.println("Enter the number of columns:");
     int column=sc.nextInt();
     int array[][]=new int[rows][column];
     for(int i=0; i<rows; i++)
     {
        for(int j=0; j<column; j++){
            array[i][j]=sc.nextInt();
        }
     }
     System.out.println("Enter the element to search its index:");
     int x=sc.nextInt();
     for(int i=0; i<rows; i++)
     {
        for(int j=0; j<column; j++)
        {
            if(array[i][j]==x)
            {
                System.out.printf("Element found at " +i, +j );
            }
        }
     }
    }
    
}
