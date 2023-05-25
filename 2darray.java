import java.util.*;
public class 2darray{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int column=sc.nextInt();
        int [][] array= new int[rows][column];
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
                System.out.println("The array is :"+ array[i][j]);
            }
        }

    }
    
}
