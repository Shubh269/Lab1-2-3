import java.util.*;
public class pattern2
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner row = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = row.nextInt();
        for(i = 0;i<=r-1;i++)
        {
            for(j = 0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 0;k<=r-1-i;k++)
            {
                System.out.print("*"+"");
            }
            System.out.println();
        }
    }
}