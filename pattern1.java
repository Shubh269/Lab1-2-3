import java.util.*;
public class pattern1
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner row = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = row.nextInt();
        for(i = 0;i< r;i++)
        {
            for(j = r-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}