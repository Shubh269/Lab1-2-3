/*class Mother
{
    void show()
    {
        System.out.println("Hello World");
    }
}*/
class Child extends Mother
{
    void show()
    {
        System.out.println("Hello JUET");
    }
}
class Application
{
    public static void main()
    {
        Child c = new Child();
        c.show();
    }
}