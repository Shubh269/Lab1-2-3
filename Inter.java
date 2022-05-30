class Test implements Testable
{
    public void display()
    {
        System.out.println("Displaying Interface");
    }
}
public class Inter
{
    public static void main(String[] args)
    {
        Test t = new Test();
        t.display();
    }
}