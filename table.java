import java.util.*;
public class table
{
    public static void main(String[] args)
    {
        int num,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int r = sc.nextInt();
        for (i = 1;i<=10; i++)
        {
            int a = r*i;
            System.out.println(r+" * "+i+" = "+ a);
        }
        
    }
}