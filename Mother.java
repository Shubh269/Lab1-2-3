class Mother
{
    int x;
    void show()
    {
        System.out.println("Empty");
    };
}
class Child extends Mother
{
    
}
class Application
{
    public static void main(String args[])
    {
        Child c = new Child();
        c.show();
    }
}

