import java.util.*;
public class oddnum{
    public static void main(String[] agrs){
        System.out.println("Enter the elements in array:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column=sc.nextInt();
        int[][] array= new int[rows][column];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<column; j++)
            {
                array[i][j]=sc.nextInt();
            }
        
        }
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print(+ array[i][j] +" ");
                
            }
            System.out.println();
        }

    }
    
}

